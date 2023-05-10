package brickBreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlay extends JPanel implements KeyListener, ActionListener {
    //properties
    //the game should not play by itself
    private boolean play=false;
    //count score starting should be zero
    private int score=0;
    //total breaks in game
    private int totalBreaks=21;
    //timer for movement of ball how fast it should move
    Timer timer;
    //speed of ball to give it to timer
    private int delay=8;
    //x axis and y axis of the slider and bar ball both
    //starting position of slider
    private int playerX=310;
    //for ball starting position
    private int ballposX=120;
    private int ballposy=350;
    //direction  of the ball
    private int ballXdir=-1;
    private int ballYdir=-2;
    private MapGenerator map;
     public GamePlay(){
         map=new MapGenerator(3,7);


         addKeyListener(this);
         setFocusable(true);
         setFocusTraversalKeysEnabled(false);
         timer=new Timer(delay,this);
         timer.start();


    }
    //draw different shapes like slider,ball,tiles
    public void paint(Graphics g){
        //background
        g.setColor(Color.black);
        g.fillRect(1,1,692,592);

        //drawing map
        map.draw((Graphics2D)g);

        //borders
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
       g.fillRect(683,0,3,592);

        //the paddle
        g.setColor(Color.green);
        g.fillRect(playerX,550,100,8);

        //the ball
        g.setColor(Color.yellow);
        g.fillOval(ballposX,ballposy,20,20);


        g.dispose();


    }







    @Override
    public void actionPerformed(ActionEvent e) {
         timer.start();
         if(play){
             //intersection  with peddle
             if(new Rectangle(ballposX,ballposy,20,20).intersects(new Rectangle(playerX,550,100,8))){
                 ballYdir=-ballYdir;
             }
             A:  for(int i=0;i<map.map.length;i++){
                  for(int j=0;i<map.map[0].length;j++){
                     if(map.map[i][j]>0){
                         int breakX=j* map.breakWidth+80;
                         int breakY=i* map.breakHeight+50;
                         int breakWidth=map.breakWidth;
                         int breakHeight=map.breakHeight;


                         Rectangle rect=new Rectangle(breakX,breakY,breakWidth,breakHeight);
                         Rectangle ballRect =new Rectangle(ballposX,ballposy,20,20);
                         Rectangle brickRect=rect;
                         if(ballRect.intersects(brickRect)){
                             map.setBreakValue(0,i,j);
                             totalBreaks--;
                             score+=5;
                             if(ballposX+19<= brickRect.x || ballposX +1 >=brickRect.x +brickRect.width){
                                 ballXdir=-ballXdir;
                             }else{
                                 ballYdir=-ballYdir;
                             }
                             break A;
                         }

                     }
                 }

             }



             ballposX+=ballXdir;
             ballposy+=ballYdir;
             if(ballposX<0){
                 ballXdir=-ballXdir;
             }
             if(ballposy<0){
                 ballYdir=-ballYdir;
             }
             if(ballposX>670){
                 ballXdir=-ballXdir;
             }
         }
         repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
      if(e.getKeyCode()==KeyEvent.VK_RIGHT){
          if(e.getKeyCode()==KeyEvent.VK_RIGHT){
              if(playerX>=580){
                  playerX=580;
              }
              else{
                  moveRight();
              }

          }

      }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            if(playerX<=10){
                playerX=10;
            }
            else{
               moveLeft();
            }

        }

    }
    public void moveRight(){
         play=true;
         playerX+=20;
    }

    public void moveLeft(){
        play=true;
        playerX-=20;
    }
}
