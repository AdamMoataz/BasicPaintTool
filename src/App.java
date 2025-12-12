import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.Line;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Simple Paint Program");
        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        // create a drawing canvas
        final DrawingCanvas canvas = new DrawingCanvas();
    }
}
class DrawingCanvas extends JPanel{
    private Color currentColor = Color.BLACK;
    private int x1,y1,x2,y2;
    private List<LineSegment> segments = new ArrayList<>();

public DrawingCanvas(){

}

private static class LineSegmant{
    int x1,y,x2,y2;
LineSegmant(){

}
}
