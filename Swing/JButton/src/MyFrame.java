import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    //when we dont have Action listiner we use simple lamda expresson
    MyFrame(){
        ImageIcon icon=new ImageIcon("C:\\Users\\Lenovo\\Pictures\\download (1).jpg");
        ImageIcon icon1=new ImageIcon("C:\\Users\\Lenovo\\Pictures\\messi-wallpaper-free-download.jpg");
        label=new JLabel();
        label.setIcon(icon1);
        label.setBounds(150,350,150,150);
        label.setVisible(false);



        button=new JButton();
        button.setBounds(100,100,250,250);
        button.addActionListener(this);
        //button.addActionListener(e-> System.out.println("poo"));
        //let customized the button
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("MV Boli",Font.BOLD,15));
        button.setIconTextGap(-5);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLayout(null);
       this.setSize(450,450);
       this.setVisible(true);
       this.add(button);
       this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("poo");
            label.setVisible(true);


        }
    }
}
