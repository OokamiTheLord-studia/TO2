package tk.arktech;

import javax.swing.*;
import java.awt.*;

class GUI extends JFrame {

    private Canvas canvas;

    private GUI(String name)
    {
        super.setName(name);
    }

    public Graphics2D getCanvasGraphics()
    {
        return canvas.getGraphics();
    }

    static GUI display(){
        GUI gui = new GUI("GUI");
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.canvas = new Canvas();
        gui.add(gui.canvas);
        gui.setSize(500, 500);
        gui.setResizable(false);
        gui.setVisible(true);

        return gui;
    }


}
