import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon yIcon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        xIcon=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\foricon.jpg");
        yIcon=new ImageIcon("C:\\Users\\Lenovo\\Pictures\\messi-wallpaper-free-download.jpg");

        button=new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox=new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.BOLD,35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(yIcon);


        this.add(button);
        this.add((checkBox));


        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());

        }

    }
}
