import javax.swing.*;
import java.awt.*;

public class draq extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillRect(100, 100, 100, 100);
    }
}
