import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        // Create a frame and add the drawing canvas to it
        Frame f=new Frame();
        f.setLayout(null);
        f.setSize(400, 200);
        f.setVisible(true);
        Drawing d=new Drawing();
        f.add(d);
        // Add a window listener to end the program for when the window is closed
        f.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }
}
