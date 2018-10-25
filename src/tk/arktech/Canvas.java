package tk.arktech;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Canvas extends JPanel {
    private BufferedImage img = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
    private Graphics2D imgG2 = img.createGraphics();

    public Graphics2D getGraphics() {
        return imgG2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int w = img.getWidth();
        int h = img.getHeight();
        imgG2.setColor(new Color(0,0,0));
//        imgG2.drawString("test", 10, 10);
//        imgG2.setStroke(new BasicStroke(1));
//        imgG2.drawOval(100,100,50,50);
//        imgG2.drawOval(100,100,1,1);
//        imgG2.setStroke(new BasicStroke(3));
//        imgG2.drawOval(140,140,1,1);
        g2.drawImage(img, 0, 0, w, h, null);
    }
}



