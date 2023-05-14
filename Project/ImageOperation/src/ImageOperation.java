import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageOperation implements ActionListener {
    public static void operate(int key){

    }
    public static void  main(String[] args) {

        JFrame jFrame=new JFrame();
        //button
        JButton button1=new JButton("Open Image");
        button1.setBounds(30,30,100,30);
        button1.setBackground(Color.GREEN);
        button1.setFont(new Font("Roboto",Font.BOLD,11));


        //textfield
        JTextField jTextField=new JTextField();
        jTextField.setBounds(140,30,300,30);
        jTextField.setFont(new Font("Roboto",Font.BOLD,15));
        button1.addActionListener(e -> {
            System.out.println("Button clicked");
            String text= jTextField.getText();
            int temp=Integer.parseInt(text);
            operate(temp);

        });

        jFrame.add(button1);
        jFrame.add(jTextField);

        jFrame.setTitle("Image E&D");
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}