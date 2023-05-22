import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon icon1=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\foricon.jpg");
    ImageIcon icon2=new ImageIcon("C:\\Users\\Lenovo\\Pictures\\messi-wallpaper-free-download.jpg");
    ImageIcon icon3=new ImageIcon("C:\\Users\\Lenovo\\Pictures\\naruto.png");

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
         pizzaButton=new JRadioButton("pizza");
         hamburgerButton=new JRadioButton("hamburger");
         hotdogButton=new JRadioButton("hotdog");
         pizzaButton.setIcon(icon1);
         hamburgerButton.setIcon(icon2);
         hotdogButton.setIcon(icon3);



        ButtonGroup group=new ButtonGroup();
        
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);




        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("You ordered pizza");
        }
        if(e.getSource()==hamburgerButton){
            System.out.println("You ordered hamburger");
        }
        if(e.getSource()==hotdogButton){
            System.out.println("You ordered hotdog");
        }

    }
}
