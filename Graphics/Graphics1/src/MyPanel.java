import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    int x=50;
    int y=50;
    MyPanel(){
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30) );
        g.drawString("Nirendra",300,50);
        g.drawLine(200,200,300,300);
        g.setColor(Color.blue);
         g.drawOval(x+10,y+10,50,50);
         g.fillOval(x,y+50,50,50);
     String url="C:\\Users\\Lenovo\\Pictures\\messi-wallpaper-free-download.jpg";
        Image image=new ImageIcon(url).getImage();
        g.drawImage(image,400,50,200,200,null);
    //    g.clearRect(0,0,600,600);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
