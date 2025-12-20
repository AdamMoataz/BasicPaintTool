
import java.awt.*;
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
    }
}

class DrawingCanvas extends JPanel {

    private Color currentColor = Color.BLACK;
    private int x1, y1, x2, y2;
    private List<LineSegment> segments = new ArrayList<>();

    public DrawingCanvas() {

    }

    public void setCurrentColor(Color color ){
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
