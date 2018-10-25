package tk.arktech;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	GUI gui = GUI.display();
	Line l = new Line(new Point(10,10),
			new Point(100, 100),
			3);
	l.draw(gui.getCanvasGraphics());


    }
}
