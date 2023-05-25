import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BaseMultiResolutionImage;

public class MyPanel extends JPanel implements ActionListener {
     final int PANEL_WIDTH=500;
     final int PANEL_HEIGHT=500;
     Image enemy;
     Image backgroundImage;
     Timer timer;
     int xVelocity=2;
     int yVelocity=1;
     int x=0;
     int y=0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\sun.png").getImage();
        backgroundImage= new ImageIcon("C:\\Users\\Lenovo\\Downloads\\blue-house-with-blue-roof-sky-background.jpg").getImage();

        timer=new Timer(10,this);
        timer.start();


    }
    public void paint(Graphics g){
        super.paint(g);//this will paint background
        Graphics2D g2D=(Graphics2D)g;
        g2D.drawImage(backgroundImage,0,0,null);
        g2D.drawImage(enemy,x,y,null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

       if(x>=PANEL_WIDTH-enemy.getWidth(null)||x<0){
         xVelocity=xVelocity * -1;
       }

        x=x+xVelocity;
        if(y>=PANEL_HEIGHT-enemy.getHeight(null)||y<0){
            yVelocity=yVelocity * -1;
        }

        y=y+yVelocity;
        repaint();

    }
}
