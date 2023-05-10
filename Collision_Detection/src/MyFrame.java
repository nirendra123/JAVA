import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame {
    Image image;
    Graphics graphics;
    Box player;
    Box enemy;
    boolean gameover;
    MyFrame(){
        player=new Box(100,300,50,50,Color.BLUE);
        enemy=new Box(400,300,50,50,Color.RED);
        gameover=false;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
        this.addKeyListener(new AL());



    }
    public void paint(Graphics g){
     image=createImage(this.getWidth(),this.getHeight());
     graphics=image.getGraphics();
     //this =pass frame
     g.drawImage(image,0,0,this);
     player.draw(g);
     enemy.draw(g);
     if(gameover){
         g.setColor(Color.red);
         g.setFont(new Font("MV Boli",Font.PLAIN,45));
         g.drawString("Game Over!",150,100);
     }
    }

    public void checkCollision(){
       if( player.intersects(enemy)) {
           gameover = true;
           System.out.println("Game Over!!!");
       }

    }
    public class AL extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
            checkCollision();
            repaint();
        }
    }



}
