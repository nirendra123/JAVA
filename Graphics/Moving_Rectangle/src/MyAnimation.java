import javax.swing.*;
import java.awt.*;

public class MyAnimation extends JPanel {
    int x=0;
    int y=100;
    int width=100;
    int height=50;
    int stepsize=10;
    int maxX;
    int maxY;
    MyAnimation(int width,int height){
        this.maxX=width;
        this.maxY=height;

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);
        if(x+width>maxX||x<0){
            stepsize=-stepsize;       }


        x = x + stepsize;
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();

    }
}
