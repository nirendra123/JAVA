import javax.swing.*;
import java.awt.*;

public class Gui {

  public static void render(){
      JFrame frame=new JFrame("layout");
      frame.setLayout(new BorderLayout());
      JPanel jPanel=new JPanel();

      jPanel.setBackground(Color.ORANGE);
      frame.add(jPanel,BorderLayout.NORTH);

      JPanel jP=new JPanel();

      jP.setBackground(Color.BLUE);
      frame.add(jP,BorderLayout.WEST);
      JPanel j=new JPanel();

      j.setBackground(Color.RED);
      frame.add(j,BorderLayout.SOUTH);
      JPanel jpa=new JPanel();

      jpa.setBackground(Color.GREEN);
      frame.add(jpa,BorderLayout.EAST);
      JPanel p1=new JPanel();

      p1.setBackground(Color.GRAY);
      jPanel.setLayout( new FlowLayout(FlowLayout.LEFT));

      frame.add(p1,BorderLayout.CENTER);
      jPanel.add(new JButton ("click me"));
      jPanel.add(new JButton ("click me"));
      jPanel.add(new JButton ("click me"));
      jpa.setLayout(new BoxLayout(jpa,BoxLayout.Y_AXIS));
      jpa.add(new JButton ("click me"));
      jpa.add(new JButton ("click me"));

      jpa.add(new JButton ("click me"));
      p1.setLayout(new GridLayout(2,2));
      p1.add(new JButton ("click me"));
      p1.add(new JButton ("click me"));
      p1.add(new JButton ("click me"));






      frame.setSize(400,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
    //frame.setResizable(false);
       frame.setVisible(true);

   }
}
