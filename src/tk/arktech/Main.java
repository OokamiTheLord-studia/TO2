package tk.arktech;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	GUI gui = GUI.display();
	FileReader fr = new FileReader(new RectangleParser(),
            "C:\\\\temp\\temp.txt"
    );
	fr.getParser().add(
                new CircleParser()
                        ).add(
                                new LineParser()).add(
                                    new PointParser());
	ArrayList<Drawable> a = fr.startParsing();
	Rectangle r = new Rectangle(new Point(50,50),50,50);
	r.draw(gui.getCanvasGraphics());
	//a.get(0).draw(gui.getCanvasGraphics());

	//a.forEach((d)->(d).draw(gui.getCanvasGraphics()));






	}


}
