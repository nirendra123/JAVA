import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        MyPanel myPanel=new MyPanel();
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(myPanel);
        frame.setVisible(true);
    }
}