
import javax.swing.*;

public class Main
{
    public static void main(String[] args) {

        GUI_1_1 frame = null;
        frame = new GUI_1_1();

        frame.setSize(1200, 750);
        frame.setTitle("Lightweight text editor");

        frame.setLocation(100, 100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

class GUI_1_1 extends JFrame{

    GUI_1_1()
    {
        GUI_1 panel = new GUI_1();
        add(panel);
    }
}



