import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLOutput;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon nepal;
    ImageIcon sun;
    ImageIcon youtube;
    ImageIcon blueHouse;
   MyFrame(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(500,500);
       this.setLayout(new FlowLayout());

       label=new JLabel();
       label.setBounds(0,0,100,100);
      // label.setBackground(Color.red);
       nepal=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\nepal.png");
       sun=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\sun.png\"");
       youtube=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\youtube.png");
       blueHouse=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\blue-house-with-blue-roof-sky-background.jpg");
       label.setIcon(nepal);


      // label.setOpaque(true);
      // label.addMouseListener(this);
       this.setLocationRelativeTo(null);
        this.addMouseListener(this);


       this.add(label);
       this.pack();

       this.setVisible(true);
   }


    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has clicked (pressed and released) on a component

      //  System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
       //Invoked when a mouse button has been pressed on a component
      //  System.out.println("You pressed the mouse");
     //   label.setBackground(Color.YELLOW);
        label.setIcon(sun);


    }

    @Override
    public void mouseReleased(MouseEvent e) {
       //Invoked when a mouse button has been released on a component
      //  System.out.println("You released the mouse");
       // label.setBackground(Color.GREEN);
        label.setIcon(blueHouse);



    }

    @Override
    public void mouseEntered(MouseEvent e) {
       //Invoked  when the mouse enters a component
      //  System.out.println("You entererd the component");
        label.setIcon(youtube);
        //label.setBackground(Color.blue);


    }

    @Override
    public void mouseExited(MouseEvent e) {
       //Invoked when the mouse exits a components
      //  System.out.println("you Exit the component");
      //  label.setBackground(Color.red);
        label.setIcon(nepal);


    }
}

