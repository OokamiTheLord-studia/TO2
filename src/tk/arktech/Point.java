package tk.arktech;

import java.awt.*;
import java.security.InvalidParameterException;

public class Point implements Drawable {
    private int x = 0;
    private int y = 0;
    private BasicStroke stroke = new BasicStroke(1);

    public Point(int x, int y) {
        if(x<0 || y<0)
        {
            throw new InvalidParameterException("Punkt musi mieć dodatnie współrzędne");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setStroke(stroke);
        g2d.setColor(new Color(0,0,0));
        g2d.drawOval(x, y, 1, 1);
    }

    public float getStrokeSize()
    {
        return stroke.getLineWidth();
    }
}
