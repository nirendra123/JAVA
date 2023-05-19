import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("GUI");//sets title of frame
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//exits out of application
        this.setResizable(false);//prevent frame from being resized
        this.setSize(420,420);//sets the x-dimension,and y-dimension of frame
        this.setVisible(true);//make frame visible

        ImageIcon image=new ImageIcon("naruto.png");//create an ImageIcon
        this.setIconImage(image.getImage());//change icon of frame
        this.getContentPane().setBackground(new Color(123,50,250));//change color of background//RGB value
    }
}
