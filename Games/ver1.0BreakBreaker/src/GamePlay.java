import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlay extends JPanel implements KeyListener, ActionListener {

    private boolean play=false;
    private int score=0;
    private int TotalBricks=21;
  private Timer timer;
  private int delay=8;

//private int playerX=320;
//private int ballposX=120;
    //private ballposY=350;
//private int ballXdir=-1;
    //private int ballYdir=-2;

    public GamePlay(){
//      addKeyListener(this);
//      setFocusable(true);
//      setFocusTraversalKeysEnabled(false);
//      timer=new Timer(delay,this);
//      timer.start();



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }


}
