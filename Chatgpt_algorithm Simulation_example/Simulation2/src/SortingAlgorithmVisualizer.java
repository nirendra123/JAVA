import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SortingAlgorithmVisualizer extends JPanel {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int ELEMENT_WIDTH = 20;
    private static final int ELEMENT_HEIGHT_MULTIPLIER = 10;
    private static final int ELEMENT_SPACING = 5;
    private static final int DELAY_MS = 100; // Decreased time delay for smoother animation
    private static final Color ELEMENT_COLOR = new Color(75, 141, 251); // Blue color for elements
    private static final Color SWAP_COLOR = new Color(251, 75, 75); // Red color for swapped elements

    private int[] elements; // array of elements to be sorted
    private Timer timer; // timer for animation

    public SortingAlgorithmVisualizer(int[] elements) {
        this.elements = elements;
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        timer = new Timer(DELAY_MS, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortAndAnimate(); // Call sortAndAnimate() on timer tick
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < elements.length; i++) {
            int elementHeight = elements[i] * ELEMENT_HEIGHT_MULTIPLIER;
            int x = i * (ELEMENT_WIDTH + ELEMENT_SPACING);
            int y = WINDOW_HEIGHT - elementHeight;
            if (elements[i] == Integer.MIN_VALUE) {
                g.setColor(SWAP_COLOR); // Set color for swapped elements
            } else {
                g.setColor(ELEMENT_COLOR);
            }
            g.fillRect(x, y, ELEMENT_WIDTH, elementHeight);
        }
    }

    public void startVisualization() {
        JFrame frame = new JFrame("Sorting Algorithm Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        timer.start(); // Start the timer for animation
    }

    private void sortAndAnimate() {
        boolean swapped = false;
        // Sort the elements using a sorting algorithm of your choice
        // For example, using bubble sort
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    // Swap the elements
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped) {
                // Repaint the panel to reflect the updated array
                repaint();

                // Delay for a specified time to show animation
                try {
                    Thread.sleep(DELAY_MS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Set swapped elements to a special value to change their color
                elements[elements.length - i - 1] = Integer.MIN_VALUE;
                elements[elements.length - i - 2] = Integer.MIN_VALUE;
                repaint();

                // Delay again to show the swapped elements in a different color
                try {
                    Thread.sleep(DELAY_MS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }// Reset the swapped elements to their original values
                elements[elements.length - i - 1] = elements[elements.length - i - 1];
                elements[elements.length - i - 2] = elements[elements.length - i - 2];
                swapped = false;
            }
        }
// Stop the timer when sorting is complete
        if (!swapped) {
            timer.stop();
        }
        repaint(); // Repaint the panel after sorting is complete
    }

    public static void main(String[] args) {
        // Prompt the user for input using a JOptionPane
        String input = JOptionPane.showInputDialog(null, "Enter the number of elements to be sorted:",
                "Sorting Algorithm Visualizer", JOptionPane.PLAIN_MESSAGE);
        int numElements = Integer.parseInt(input);
        int[] elements = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            input = JOptionPane.showInputDialog(null, "Enter element #" + (i + 1) + ":",
                    "Sorting Algorithm Visualizer", JOptionPane.PLAIN_MESSAGE);
            elements[i] = Integer.parseInt(input);
        }

        SwingUtilities.invokeLater(() -> {
            SortingAlgorithmVisualizer visualizer = new SortingAlgorithmVisualizer(elements);
            visualizer.startVisualization();
        });
    }
}


//
