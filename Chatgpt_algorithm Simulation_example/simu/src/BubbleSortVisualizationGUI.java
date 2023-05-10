import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BubbleSortVisualizationGUI {
    private JFrame frame;
    private JPanel panel;
    private SortPanel sortPanel;
    private JButton sortButton;

    private int[] arr = {5, 3, 8, 4, 2};
    private int currentPass = 1;
    private int delay = 2000; // Delay in milliseconds between each pass

    public BubbleSortVisualizationGUI() {
        frame = new JFrame("Bubble Sort Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        panel = new JPanel(new BorderLayout());

        sortPanel = new SortPanel();
        panel.add(sortPanel, BorderLayout.CENTER);

        sortButton = new JButton("Start Sort");
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortButton.setEnabled(false);
                bubbleSort();
            }
        });
        panel.add(sortButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    public void bubbleSort() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int n = arr.length;
                boolean swapped;
                for (int i = 0; i < n - 1; i++) {
                    swapped = false;
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            // Swap elements if they are in the wrong order
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    // If no two elements were swapped in the inner loop, the array is already sorted
                    if (!swapped) {
                        break;
                    }
                    sortPanel.setCurrentPass(currentPass);
                    sortPanel.repaint();
                    currentPass++;

                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

                sortPanel.setCurrentPass(currentPass);
                sortPanel.repaint();
                sortButton.setEnabled(true);
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BubbleSortVisualizationGUI();
            }
        });
    }

    private class SortPanel extends JPanel {
        private static final int RECT_WIDTH = 40;
        private static final int RECT_HEIGHT = 200;
        private static final int RECT_GAP = 20;
        private static final Color DEFAULT_COLOR = Color.BLUE;
        private static final Color CURRENT_PASS_COLOR = Color.RED;

        private int currentPass = 0;

        public void setCurrentPass(int currentPass) {
            this.currentPass = currentPass;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (int i = 0; i < arr.length; i++) {
                int x = RECT_GAP + i * (RECT_WIDTH + RECT_GAP);
                int y = RECT_HEIGHT - arr[i];
                Color color = (i < currentPass) ? CURRENT_PASS_COLOR : DEFAULT_COLOR;
                g.setColor(color);
                g.fillRect(x, y, RECT_WIDTH, arr[i]);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, RECT_WIDTH
                        , arr[i]);
                // Display the value of each element below the rectangle
                g.setColor(Color.BLACK);
                g.drawString(Integer.toString(arr[i]), x + RECT_WIDTH / 2, y + arr[i] + 15);
            }
        }
    }
}
