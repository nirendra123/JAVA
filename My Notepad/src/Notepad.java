import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

public class Notepad implements ActionListener {
    JFrame jFrame=new JFrame("MyNotepad");
    JButton jButton=new JButton("Click Me");
    JTextArea jTextArea=new JTextArea();






    public void call() throws Exception{

        jTextArea.setSize(400,300);
        jFrame.add(jTextArea);
        jButton.addActionListener(this);
        jButton.setBounds(140,300,100,30);
        jFrame.add(jButton);
        jFrame.setSize(400,400);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {
            File file = new File("Nirendra.txt");
            try {
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file);
                String str = jTextArea.getText();
                fileWriter.write(str);
                fileWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }





        }

    }
}
