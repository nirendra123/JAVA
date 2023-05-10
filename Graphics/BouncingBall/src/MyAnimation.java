import javax.swing.*;
import java.awt.*;

public class MyAnimation extends JFrame {
    Ball ball=new Ball(800,600);
    MyAnimation(){
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
        ball.setBackground(Color.black);
        add(ball);
    }


}
