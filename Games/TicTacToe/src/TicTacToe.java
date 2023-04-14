import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame jFrame = new JFrame();
    JButton jButton = new JButton();
    JPanel title_Panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel jLabel = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        jFrame.setLayout(new BorderLayout());
        jFrame.getContentPane().setBackground(new Color(50,50,50));
        jFrame.setVisible(true);



         jLabel.setBackground(new Color(25,25,25));
         jLabel.setForeground(new Color(25,255,0));
         jLabel.setFont(new Font("Ink Free", Font.BOLD, 75));
         jLabel.setHorizontalAlignment(JLabel.CENTER);
         jLabel.setText("Tic-Tac-Toe");
         jLabel.setOpaque(true);

         title_Panel.setLayout(new BorderLayout());
         title_Panel.setBounds(0, 0, 500, 100);

         button_panel.setLayout(new GridLayout(3,3));
         button_panel.setBackground(new Color(150,150,150));

         for(int i=0;i<9;i++){
             buttons[i]=new JButton();
             button_panel.add(buttons[i]);
             buttons[i].setFont(new Font("My Boli",Font.BOLD,120));
             buttons[i].setFocusable(false);
             buttons[i].addActionListener(this);
             firstTurn();

         }



        title_Panel.add(jLabel);
        jFrame.add(title_Panel,BorderLayout.NORTH);
        jFrame.add(button_panel);



    }

    public void firstTurn() {
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        if(random.nextInt(2)==0){
            player1_turn=true;
            jLabel.setText("X turn");
        }else {
            player1_turn=false;
            jLabel.setText("O turn");

        }



    }

    public void check() {


    }

    public void xWins(int a, int b, int c) {

    }

    public void oWins(int a,int b,int c) {

    }

    public void move(int i) {


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


