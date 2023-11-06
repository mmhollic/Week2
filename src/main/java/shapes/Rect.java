package shapes;

import java.awt.*;

public class Rect extends Shape{

    private int width;
    private int height;

    public Rect(int width,int height, Point position, Color colour) {
        super(position, colour);
        this.width = width;
        this.height = height;

    }
    public void draw(Graphics g) {
        g.setColor(colour);
        g.fillRect(position.x, position.y, width, height);
    }
}
