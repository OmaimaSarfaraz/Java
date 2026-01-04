package Dsaconceptvisualizer;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class SortingScreen extends JPanel {

    private Main main;
    private SortingPanel panel;
    private SortingAlgorithms sorter;
    private int[] arr;

    public SortingScreen(Main main) {
        this.main = main;
        this.arr = new int[0]; // start with empty array, user will input later

        sorter = new SortingAlgorithms();
        panel = new SortingPanel();
        panel.setArray(arr);

        setLayout(new BorderLayout());

        // Controls
        JPanel controls = new JPanel();
        JTextField arrayField = new JTextField(20);
        JComboBox<String> algoSelect = new JComboBox<>(new String[]{"Bubble Sort", "Selection Sort"});
        JButton sortBtn = new JButton("Sort");
        JButton back = new JButton("Back");

        controls.add(new JLabel("Array (comma separated):"));
        controls.add(arrayField);
        controls.add(algoSelect);
        controls.add(sortBtn);
        controls.add(back);

        // Button actions
        sortBtn.addActionListener(e -> {
            try {
                // Prompt user for array input if array is empty
                if (arr == null || arr.length == 0) {
                    promptUserArray();
                }

                // Also allow user to type/change array in JTextField
                String text = arrayField.getText();
                if (text != null && !text.trim().isEmpty()) {
                    String[] tokens = text.split(",");
                    arr = new int[tokens.length];
                    for (int i = 0; i < tokens.length; i++) {
                        arr[i] = Integer.parseInt(tokens[i].trim());
                    }
                    panel.setArray(arr);
                }

                List<String> steps;
                if (algoSelect.getSelectedItem().equals("Bubble Sort")) {
                    steps = sorter.BubbleSort(arr);
                } else {
                    steps = sorter.InsertionSort(arr);
                }
                showSteps(steps);
                panel.setArray(arr);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        back.addActionListener(e -> main.showScreen("HOME"));

        add(panel, BorderLayout.CENTER);
        add(controls, BorderLayout.NORTH);
    }

    // Method to prompt user for array input
    private void promptUserArray() {
        String input = JOptionPane.showInputDialog(this, "Enter array elements (comma separated):");
        if (input != null && !input.trim().isEmpty()) {
            String[] tokens = input.split(",");
            arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i].trim());
            }
            panel.setArray(arr);
        } else {
            arr = new int[0]; // empty array if user cancels or enters nothing
        }
    }

    private void showSteps(List<String> steps) {
        StringBuilder sb = new StringBuilder();
        for (String s : steps) sb.append(s).append("\n");
        JOptionPane.showMessageDialog(this, sb.toString(), "Algorithm Steps", JOptionPane.INFORMATION_MESSAGE);
    }
}