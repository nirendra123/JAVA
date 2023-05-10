package simulation1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SortingAlgorithmSimulationGUI extends JFrame {
    private JPanel sortingPanel;
    private JButton startButton;
    private int[] array;
    private int comparisonIndex;
    private int swapIndex;
    private JLabel resultLabel;

    public SortingAlgorithmSimulationGUI() {
        setTitle("Sorting Algorithm Simulation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        sortingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawArray(g);
            }
        };

        startButton = new JButton("Start Sorting");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startSorting();
            }
        });

        resultLabel = new JLabel();
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        add(sortingPanel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);
    }

    private void startSorting() {
        String input = JOptionPane.showInputDialog(this, "Enter comma-separated numbers:", "Input", JOptionPane.PLAIN_MESSAGE);

        if (input == null) {
            return; // User cancelled input dialog
        }

        try {
            String[] inputArray = input.split(",");
            array = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                array[i] = Integer.parseInt(inputArray[i]);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter comma-separated numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            startButton.setEnabled(true); // Enable start button
            return;
        }

        // Reset comparisonIndex and swapIndex
        comparisonIndex = -1;
        swapIndex = -1;
        resultLabel.setText(""); // Clear result label
        repaint(); // Redraw panel

        // Start sorting based on selected algorithm
        String[] options = {"Bubble Sort", "Selection Sort", "Insertion Sort"};
        int selectedOption = JOptionPane.showOptionDialog(this, "Select sorting algorithm:", "Select Algorithm", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (selectedOption) {
            case 0:
                bubbleSort();
                break;
            case 1:
                selectionSort();
                break;
            case 2:
                insertionSort();
                break;
            default:
                // Do nothing
                break;
        }
    }

    private void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                comparisonIndex = j;
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
        }
        resultLabel.setText("Sorting Complete!");
    }

    private void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                comparisonIndex = j;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
            swap(i, minIndex);
        }
        resultLabel.setText("Sorting Complete!");
    }

    private void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                comparisonIndex = j;
                array[j + 1] = array[j];
                j = j - 1;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
            array[j + 1] = key;
            swapIndex = j + 1;
        }
        resultLabel.setText("Sorting Complete!");
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        swapIndex = i;
    }

    private void drawArray(Graphics g) {
        int panelWidth = sortingPanel.getWidth();
        int panelHeight = sortingPanel.getHeight();
        int barWidth = panelWidth / array.length;
        int barHeightUnit = panelHeight / (array.length + 1);

        for (int i = 0; i < array.length; i++) {
            int barHeight = array[i] * barHeightUnit;
            int x = i * barWidth;
            int y = panelHeight - barHeight;
            g.setColor(Color.BLUE);
            g.fillRect(x, y, barWidth, barHeight);
            if (i == comparisonIndex) {
                g.setColor(Color.RED);
                g.fillRect(x, y, barWidth, barHeight);
            }
            if (i == swapIndex) {
                g.setColor(Color.GREEN);
                g.fillRect(x, y, barWidth, barHeight);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SortingAlgorithmSimulationGUI gui = new SortingAlgorithmSimulationGUI();
                gui.setVisible(true);
            }
        });
    }
}

