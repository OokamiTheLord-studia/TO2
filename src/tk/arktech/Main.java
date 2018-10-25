package tk.arktech;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	GUI gui = GUI.display();
	Circle c = new Circle(new Point(100, 100),
			50,
			5);
	c.draw(gui.getCanvasGraphics());


    }
}
