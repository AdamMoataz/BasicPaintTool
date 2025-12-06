import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Simple Paint Program");
        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        // create a drawing canvas
        final DrawingCanvas canvas = new DrawingCanvas();
    }
}
