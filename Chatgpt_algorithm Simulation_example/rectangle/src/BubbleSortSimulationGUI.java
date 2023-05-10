import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class BubbleSortSimulationGUI {
    private JFrame frame;
    private JPanel panel;
    private JTextArea textArea;
    private JButton sortButton;

    private int[] arr = {5, 3, 8, 4, 2};
    private int currentPass = 1;

    public BubbleSortSimulationGUI() {
        frame = new JFrame("Bubble Sort Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        panel = new JPanel(new BorderLayout());

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        sortButton = new JButton("Start Sort");
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bubbleSort();
            }
        });
        panel.add(sortButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    public void bubbleSort() {
        sortButton.setEnabled(false);
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
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            textArea.append("Pass " + currentPass + ": " + Arrays.toString(arr) + "\n");
                            currentPass++;
                        }
                    });

                    try {
                        Thread.sleep(1000); // Delay for visualization
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        textArea.append("Sorted array: " + Arrays.toString(arr) + "\n");
                        sortButton.setEnabled(true);
                    }
                });
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BubbleSortSimulationGUI();
            }
        });
    }
}
