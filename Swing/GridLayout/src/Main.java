import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //GridLayout = places component in a grid cells.
        //             Each components takes all the available space within its cell,
        //             add each cell is the same size.




        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(2,2,2,2));
        
        
        JPanel panel =new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setLayout(new GridLayout(3,3,2,2));
        





        frame.setVisible(true);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));


        frame.add(panel);


    }
}