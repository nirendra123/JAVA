package ChatApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Server extends JFrame implements ActionListener {

    JPanel jPanel1;
    JTextField textField;
    JPanel a1;
     public Server(){

         jPanel1=new JPanel();

         jPanel1.setBackground(new Color(7,94,84));
         jPanel1.setBounds(0,0,400,60);
         jPanel1.setLayout(null);
         add(jPanel1);
         ImageIcon i1=new ImageIcon(getClass().getResource("icons/3.png"));
         Image i2= i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel back=new JLabel(i3);
         back.setBounds(5,20,25,25);
         jPanel1.add(back);

         back.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                 super.mouseClicked(e);
                 System.exit(0);

             }
         });

         ImageIcon i4=new ImageIcon(getClass().getResource("icons/1.png"));
         Image i5= i4.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
         ImageIcon i6=new ImageIcon(i5);
         JLabel profile=new JLabel(i6);
         profile.setBounds(35,13,40,40);
         jPanel1.add(profile);

         ImageIcon i7=new ImageIcon(getClass().getResource("icons/video.png"));
         Image i8= i7.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
         ImageIcon i9=new ImageIcon(i8);
         JLabel video=new JLabel(i9);
         video.setBounds(250,20,25,25);
         jPanel1.add(video);

         ImageIcon i10=new ImageIcon(getClass().getResource("icons/phone.png"));
         Image i11= i10.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
         ImageIcon i12=new ImageIcon(i11);
         JLabel phone=new JLabel(i12);
         phone.setBounds(300,20,25,25);
         jPanel1.add(phone);

         ImageIcon i13=new ImageIcon(getClass().getResource("icons/3icon.png"));
         Image i14= i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
         ImageIcon i15=new ImageIcon(i14);
         JLabel icon3=new JLabel(i15);
         icon3.setBounds(350,20,10,25);
         jPanel1.add(icon3);

         JLabel name=new JLabel("Nirendra");
         name.setBounds(80,15,100,18);
         name.setForeground(Color.WHITE);
         name.setFont(new Font("SAN_SERIF",Font.BOLD,15));
         jPanel1.add(name);

         JLabel status=new JLabel("Active now");
         status.setBounds(80,30,100,18);
         status.setForeground(Color.WHITE);
         status.setFont(new Font("SAN_SERIF",Font.PLAIN,10));
         jPanel1.add(status);


          a1=new JPanel();
         a1.setBounds(5,65,390,500);

         add(a1);

         textField=new JTextField();
         textField.setBounds(5,575,300,50);
         textField.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
         add(textField);


         JButton send=new JButton("Send");
         send.setBounds(310,575,80,50);
         send.setBackground(new Color(7,94,84));
         send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
         send.setForeground(Color.WHITE);
         send.addActionListener(this);
         add(send);



       setLayout(null);
       setUndecorated(true);
       setSize(400,650);
       setTitle("Server");
      getContentPane().setBackground(Color.WHITE);
       setResizable(false);
       setLocation(200,0);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);

     }
    @Override
    public void actionPerformed(ActionEvent e) {
         String output=textField.getText();


    }

    public static void main(String[] args) {
        new Server();
    }



}
