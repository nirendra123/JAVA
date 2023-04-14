import javax.swing.*;
import java.awt.*;

public class Box extends JFrame {
    public Box(JPanel jPanel) {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);

//        JPanel panel= new JPanel() {
//            @Override
//            public void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.setColor(Color.RED);
//                g.fillRect(100, 100, 100, 100);
//            }
//        };
//        getContentPane().add(panel);
        setVisible(true);
////        repaint();
    }
}
