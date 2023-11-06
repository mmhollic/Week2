import shapes.Circle;
import shapes.Rect;
import shapes.Square;

import java.awt.*;

public class Drawing extends Canvas {
    // Declare the shapes - they can all be private as nothing else needs to access them
    private Circle circ;
    private Square sq;
    private Rect rect;
    public Drawing() {
        setSize(400, 200);
        setBackground(Color.white);
        // Create the shapes
        circ=new Circle(50, new Point(100, 100), Color.red);
        sq=new Square(50, new Point(200, 100), Color.blue);
        rect=new Rect(50, 100, new Point(300, 100), Color.green);
    }

    public void paint(Graphics g) {
        // Draw the shapes
        circ.draw(g);
        sq.draw(g);
        rect.draw(g);
    }

}
