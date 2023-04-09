import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Mytitle");
        TextField textField=new TextField("Enter Your Username");
       textField.setBounds(0,50,200,20);
        frame.add(textField);
        TextField text=new TextField("Enter Your Password");
        text.setBounds(0,70,200,20);
        frame.add(text);
        JButton button=new JButton("Login");
        button.setBounds(30,90,100,100);
        frame.add(button);
//        Label label1=new Label("Enter Your UserName:");
//        label1.setBounds(0,30,100,20);
//        frame.add(label1);
        String[] fruits={"Apple","Orange","Grapes"};

JComboBox jComboBox=new JComboBox(fruits);
jComboBox.setBounds(20,200,100,100);
frame.add(jComboBox);














        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}