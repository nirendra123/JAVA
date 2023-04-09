import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class TicTacToe implements ActionListener , MouseListener {

    Random random=new Random();
    JFrame jFrame=new JFrame("TicTacToe");
    JButton jButton=new JButton();
    JPanel title_Panel=new JPanel();
    JPanel button_pannel=new JPanel();
    JLabel jLabel=new JLabel();
    JButton[] buttons=new JButton[9];
    boolean player1_turn;
    TicTacToe(){
        jFrame.setLayout(new BorderLayout());
        jFrame.setSize(800,800);
        jFrame.getContentPane().setBackground(Color.BLACK);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

        jLabel.setBackground(Color.WHITE);
        jLabel.setForeground(Color.GREEN);
        jLabel.setFont(new Font("Ink Free",Font.BOLD,75));
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setText("Tic-Tac-Toe");
       jLabel.setOpaque(true);

        title_Panel.setLayout(new BorderLayout());
        title_Panel.setBounds(0,0,800,100);

        title_Panel.add(jLabel);
        jFrame.add(title_Panel);


    }

    public void firstTurn(){



    }
    public void check(){


    }

    public void xWins(int a ,int b,int c){

    }
    public void yWins(){

    }

   public void move(int i){


   }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
