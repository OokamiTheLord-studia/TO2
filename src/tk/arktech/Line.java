package tk.arktech;

import java.awt.*;

public class Line implements Drawable {
    private Point start;
    private Point end;
    private BasicStroke stroke;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.stroke = new BasicStroke(1);
    }

    public Line(Point start, Point end, float stroke)
    {
        this.start = start;
        this.end = end;
        this.stroke = new BasicStroke(stroke);

    }




    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double length()
    {
        double a = end.getX() - start.getX();
        double b = end.getY() - start.getY();
        return Math.sqrt(a*a+b*b);
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setColor(new Color(0,0,0));
        g2d.setStroke(stroke);
        g2d.drawLine(start.getX(), start.getY(), end.getX(), end.getY());
    }

    public float getStrokeSize()
    {
        return stroke.getLineWidth();
    }

    public void setStrokeSize(float f)
    {
        stroke = new BasicStroke(f);
    }

}
