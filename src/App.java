
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Simple Paint Program");
        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        // create a drawing canvas
        final DrawingCanvas canvas = new DrawingCanvas();
        container.add(canvas, BorderLayout.CENTER);

        // create a color choser
        JPanel controls = new JPanel();
        container.add(controls, BorderLayout.NORTH);

        JButton colorButton = new JButton("pick color");
        controls.add(colorButton);
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

            }
        });
    }
}

class DrawingCanvas extends JPanel {

    private Color currentColor = Color.BLACK;
    private int x1, y1, x2, y2;
    private List<LineSegment> segments = new ArrayList<>();

    public DrawingCanvas() {
        setDoubleBuffered(false);
        setPreferredSize(new Dimension(800, 600));

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }

            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                segments.add(new LineSegment(x1, y1, x2, y2, currentColor));
                repaint();
            }

        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                segments.add(new LineSegment(x1, y1, x2, y2, currentColor));
                x1 = x2;
                y1 = y2;
                repaint();
            }
        });
    }

    public void setCurrentColor(Color color) {
        currentColor = color;
    }

    private static class LineSegment {

        int x1, y1, x2, y2;
        Color color;

        LineSegment(int x1, int y1, int x2, int y2, Color color) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            this.color = color;
        }
    }
}
