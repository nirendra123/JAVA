import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUICounter implements ActionListener {
    //decleration
    static int counter=1;

    JFrame jFrame = new JFrame("Counter_Application");
    JButton incrementButton = new JButton("Increase");
    JButton decrementButton = new JButton("Decrease");
    JLabel showResult = new JLabel();
   public GUICounter(){

       incrementButton.setBounds(100,300,100,40);
       decrementButton.setBounds(300,300,100,40);
       showResult.setBounds(150,150,200,80);
       jFrame.setSize(500,500);

       showResult.setHorizontalAlignment(JLabel.CENTER);
       showResult.setVerticalAlignment(JLabel.CENTER);
       incrementButton.setBackground(Color.BLUE);
       decrementButton.setBackground(Color.RED);
       showResult.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       showResult.setText(Integer.toString(counter));

       incrementButton.addActionListener(this);
       decrementButton.addActionListener(this);


       jFrame.add(incrementButton);
       jFrame.add(decrementButton);
       jFrame.add(showResult);


       jFrame.setLayout(null);
       jFrame.setResizable(false);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.setVisible(true);
   }

   public void increment(){
       counter++;
   }

   public void decrement() {
       counter--;
   }

   
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==incrementButton){
          increment();
          showResult.setText(Integer.toString(counter));


       }
       if(e.getSource()==decrementButton){
           decrement();
           showResult.setText(Integer.toString(counter));


       }

    }

}
