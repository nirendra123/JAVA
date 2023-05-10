import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

     MyAnimation rectangle=new MyAnimation(600,580);
    GUI(){
        setSize(600,600);
        setTitle("Moving Rectangle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        rectangle.setBackground(Color.black);
        add(rectangle);


    }
}
