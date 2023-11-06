import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setLayout(null);
        f.setSize(400, 200);
        f.setVisible(true);
        Drawing d=new Drawing();
        f.add(d);
        f.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }
}
