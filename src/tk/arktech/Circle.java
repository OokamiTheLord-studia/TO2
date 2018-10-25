package tk.arktech;

import java.awt.*;
import java.security.InvalidParameterException;

public class Circle implements Drawable, Figure {

    private Point center;
    private int radius;
    private BasicStroke stroke;

    public Circle(Point center, int radius) {
        this.center = center;
        if(radius<0)
        {
            throw new InvalidParameterException("promień nie może być ujemny");
        }
        this.radius = radius;
        this.stroke = new BasicStroke(1);
    }

    public Circle(Point center, int radius, float stroke) {
        this.center = center;
        if(radius<0)
        {
            throw new InvalidParameterException("promień nie może być ujemny");
        }
        this.radius = radius;
        this.stroke = new BasicStroke(stroke);
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setColor(new Color(0,0,0));
        g2d.setStroke(stroke);
        g2d.drawOval(center.getX()-radius, center.getY()-radius, 2*radius, 2*radius);
    }

    public float getStrokeSize()
    {
        return stroke.getLineWidth();
    }

    public void setStrokeSize(float f)
    {
        stroke = new BasicStroke(f);
    }

    public double getArea()
    {
        return Math.PI * radius*radius;
    }

    public double getPerimeter()
    {
        return 2* Math.PI * radius;
    }
}
