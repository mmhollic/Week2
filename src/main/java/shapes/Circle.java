package shapes;

import java.awt.*;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius, Point position, Color colour) {
        super(position, colour);
        this.radius = radius;

    }
    public void draw(Graphics g) {
        g.setColor(colour);
        g.fillOval(position.x, position.y, radius, radius);
    }
}
