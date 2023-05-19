import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JLabel = a GUI dispaly for a string of text,an image or both

        ImageIcon image =new ImageIcon("C:\\Users\\Lenovo\\Desktop\\JAVA\\Socket-Programming\\Chat Application Using Swing\\src\\ChatApplication\\icons\\gaitonde.jpeg");
        Border border= BorderFactory.createLineBorder(Color.CYAN,3);
        JLabel label=new JLabel();//create a label
        label.setText("Bro do you even code?");//set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text Left,Centre,Right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text Top,CENTER,BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00));//set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
        label.setIconTextGap(-5);//set gap of text to image
        label.setBackground(Color.black);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set Vertical position of icon+text within label
        label.setHorizontalAlignment((JLabel.CENTER));//set Horizontal position icon+text within label
        //label.setBounds(100,100,250,250);//set x,y position within frame as will as dimensions





        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();//resize the size of frame accomodate all of componentt we have
        
    }
}