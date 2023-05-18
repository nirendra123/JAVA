import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame=new JFrame("Facebook");
    JLabel welcomeLabel=new JLabel("Hello");
    WelcomePage(){
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));

        frame.add(welcomeLabel);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
