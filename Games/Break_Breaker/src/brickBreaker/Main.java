package brickBreaker;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        GamePlay gamePlay=new GamePlay();
        jFrame.setBounds(10,10,700,600);
        jFrame.setTitle("BreakOut Ball");
        jFrame.add(gamePlay);

  //      jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}