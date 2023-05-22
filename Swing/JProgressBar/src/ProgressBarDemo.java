import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame=new JFrame();
    JProgressBar bar=new JProgressBar(0,500);

    ProgressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        //show percentage
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(bar);
        fill();


    }
public void fill(){

        int counter =500;
        while(counter>0){
            bar.setValue(counter);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter-=1;
        }
        bar.setString("Done  :");
}









}
