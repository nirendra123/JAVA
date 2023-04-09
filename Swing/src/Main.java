import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Hello World");
        JButton button=new JButton("Click me!");
        button.setBounds(50,120,100,50);
        button.setBackground(Color.BLUE);
        frame.setSize(600,500);
        frame.add(button);
        TextField textField=new TextField("Nirendra Bajracharya");
        textField.setBounds(50,50,500,50);
        textField.setBackground(Color.RED);


        frame.add(textField);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}