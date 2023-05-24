import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.jar.JarEntry;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.addKeyListener(this);
        this.setLayout(null);

        icon=new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\images.jpg");

        label=new JLabel();
        label.setBounds(0,0,92,217);

        label.setIcon(icon);
        //label.setBackground(Color.red);
       // label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(label);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. uses keychar,char output

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = invoked when a physical key is pressed down. uses keyCode,int output
        switch (e.getKeyCode()){
            case 37:label.setLocation(label.getX()-10,label.getY());
                break;
            case 38 :label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39:label.setLocation(label.getX()+10,label.getY());
                break;
            case  40: label.setLocation(label.getX(),label.getY()+10);
                break;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
       // System.out.println("Your released Key char : " +e.getKeyChar());
       // System.out.println("You released Key code: "+e.getKeyCode());
    }
}
