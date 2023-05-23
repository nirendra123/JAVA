import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {



    JMenuBar menuBar;
    JMenu editeMenu;

    JMenu fileMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        loadIcon=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\foricon.jpg");

        menuBar=new JMenuBar();
   fileMenu=new JMenu("File");
        editeMenu=new JMenu("Edit");
        helpMenu=new JMenu("Help");

        loadItem=new JMenuItem("Load");
        saveItem=new JMenuItem("Save");
        exitItem=new JMenuItem("Exit");


        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F);//Alt +f for file
        helpMenu.setMnemonic(KeyEvent.VK_H);//Alt +H for file
       editeMenu.setMnemonic(KeyEvent.VK_E);//Alt +E for file

        loadItem.setMnemonic(KeyEvent.VK_L);//L for load
        saveItem.setMnemonic(KeyEvent.VK_S);//s for save
        exitItem.setMnemonic((KeyEvent.VK_E));//e for exit



        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editeMenu);
        menuBar.add(helpMenu);



        this.add(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

      if(e.getSource()==loadItem){
          System.out.println("loaded file");
      }

        if(e.getSource()==saveItem){
            System.out.println("save file");
        }

        if(e.getSource()==exitItem){
            System.exit(0);
        }


    }
}
