package SwingPartTwo;

import javax.swing.*;
import java.awt.*;

public class Two {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Frame");
        frame.setResizable(false);
        frame.setSize(400,400);
        Button button=new Button("click me");
        button.setBounds(50,50,50,50);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.red);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
