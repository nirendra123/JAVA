import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JFrame= a GUI window to add Components to
        JFrame jFrame=new JFrame();//creates the Frame
        jFrame.setTitle("GUI");//sets title of frame
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits out of application
        jFrame.setResizable(false);//prevent frame from being resized
        jFrame.setSize(420,420);//sets the x-dimension,and y-dimension of frame
        jFrame.setVisible(true);//make frame visible

        ImageIcon image=new ImageIcon("naruto.png");//create an ImageIcon
        jFrame.setIconImage(image.getImage());//change icon of frame
        jFrame.getContentPane().setBackground(Color.GREEN);//change color of background
    }
}