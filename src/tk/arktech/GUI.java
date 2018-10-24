package tk.arktech;

import javax.swing.*;

class GUI extends JFrame {

    private GUI(String name)
    {
        super.setName(name);
    }

    static GUI display(){
        GUI gui = new GUI("GUI");
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.add(new MyPanel());
        gui.setSize(500, 500);
        gui.setResizable(false);
        gui.setVisible(true);

        return gui;
    }


}
