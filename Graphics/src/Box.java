import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JPanel implements ActionListener {
    int boxX = 10;
    int boxY = 10;
    Button button = new Button("main");
    public Box() {        add(button);

    }

    @Override
    protected void paintComponent(Graphics g) {



        button.addActionListener(this);

        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(boxX, 10, 100, 100);

        g.setColor(Color.WHITE);
        g.fillRect(boxX, 10, 10, 20);
        g.setColor(Color.WHITE);
        g.fillRect(20+boxX, 10, 10, 20);
        g.setColor(Color.WHITE);
        g.fillRect(40+boxX, 10, 10, 20);
        g.setColor(Color.WHITE);
        g.fillRect(60+boxX, 10, 10, 20);
        g.setColor(Color.WHITE);
        g.fillRect(80+boxX, 10, 10, 20);


        g.setColor(Color.RED);
        g.fillRect(200, 10, 100, 100);

        g.setColor(Color.green);
        g.fillRect(10, 150, 100, 100);

        g.setColor(Color.YELLOW);
        g.fillRect(200, 300, 100, 100);

        g.setColor(Color.BLACK);
        g.fillRect(10, 300, 100, 100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == button) {
            boxX += 10;
            repaint();

        }
    }
}

