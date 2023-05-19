import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //panel normally uses flowlayout
        //JPanel= a GUI component that function as a container to hold other components
        ImageIcon image=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\JAVA\\Socket-Programming\\Chat Application Using Swing\\src\\ChatApplication\\icons\\3.png");


        JLabel label =new JLabel();
        label.setText("Hello");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,0,200,200);


        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(200,0,200,200);

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,200,500,500);
        redPanel.setLayout(new BorderLayout());



        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(greenPanel);
        frame.add(bluePanel);
        frame.add(redPanel);

    }
}