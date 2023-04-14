import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;

public class GUI {
    JFrame jFrame=new JFrame("Sync_Multithreading");
    JTextField jTextField=new JTextField();
    GUI(){
      jTextField.setSize(400,400);
        jFrame.setSize(400,400);

        jFrame.add(jTextField);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }
    public void writeOnTextField(String text){


    }





}
