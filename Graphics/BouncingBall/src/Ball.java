import javax.swing.*;
import java.awt.*;

public class Ball extends JPanel {
    int x=0;
    int y=0;
    int ballwidth=30;
    int ballheight=30;
    int speedX=10;
    int speedY=10;

    int maxX,maxY;
    Ball(int width,int height){
        this.maxX=width-ballwidth-40;
        this.maxY=height-ballheight-40;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(x,y,ballwidth,ballheight);
        if(x>maxX||x<0){
            speedX=-speedX;
        }
        if(y>maxY||y<0){
            speedY=-speedY;

        }

        x=x+speedX;
        y=y+speedY;
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();
    }
}
