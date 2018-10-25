package tk.arktech;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	GUI gui = GUI.display();
	Point p = new Point(100,100);
	p.draw(gui.getCanvasGraphics());
	System.out.print("X: ");
	System.out.println(p.getX());
	System.out.print("Y: ");
	System.out.println(p.getY());
	System.out.print("Stroke: ");
	System.out.println(p.getStrokeSize());
	gui.repaint();


    }
}
