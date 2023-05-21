import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        //JLayeredPane = Swing container that provides a
        //               third dimensionfor positioning components
        //               ex. depth, Z-index


        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100,100,200,200);

        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150,150,200,200);


        JLayeredPane pane=new JLayeredPane();
        pane.setBounds(0,0,500,500);
       // pane.add(label1,JLayeredPane.DEFAULT_LAYER);
        pane.add(label1,Integer.valueOf(0));
        pane.add(label2,Integer.valueOf(2));
        pane.add(label3,Integer.valueOf(1));

        JFrame frame= new JFrame();
        frame.add(pane);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}