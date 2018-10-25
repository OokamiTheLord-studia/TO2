package tk.arktech;

import java.awt.*;
import java.security.InvalidParameterException;

public class Rectangle implements Drawable, Figure {

    private Point UpperLeft;
    private int width;
    private int height;
    private BasicStroke stroke;

    public Rectangle(Point upperLeft, int width, int height, float stroke) {
        UpperLeft = upperLeft;
        if(width<0 || height < 0)
        {
            throw new InvalidParameterException("Wysokość i szerokość nie mogą być ujemne");
        }
        this.width = width;
        this.height = height;
        this.stroke = new BasicStroke(stroke);
    }

    public Rectangle(Point upperLeft, int width, int height) {
        UpperLeft = upperLeft;
        if(width<0 || height < 0)
        {
            throw new InvalidParameterException("Wysokość i szerokość nie mogą być ujemne");
        }
        this.width = width;
        this.height = height;
        this.stroke = new BasicStroke(1);
    }

    public Point getUpperLeft() {
        return UpperLeft;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setColor(new Color(0,0,0));
        g2d.setStroke(stroke);
        g2d.drawRect(UpperLeft.getX(), UpperLeft.getY(), width, height);
    }

    @Override
    public float getStrokeSize() {
        return stroke.getLineWidth();
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*height;
    }
}
