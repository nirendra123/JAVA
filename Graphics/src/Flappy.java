import javax.swing.*;

public class Flappy {
    JFrame jFrame=new JFrame("Flappy Bird");
    Box box=new Box();
    void render(){
        jFrame.add(box);
        jFrame.setSize(400,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
//        jFrame.setResizable(false);

    }
}
