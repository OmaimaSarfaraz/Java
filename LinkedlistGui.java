package Dsaconceptvisualizer;


import java.awt.*;
import java.util.List;
import javax.swing.*;

public class LinkedlistGui extends JFrame {

    private singlylinkedlist visualizer;
    private LinkedListPanel panel;

    public LinkedlistGui() {

        setTitle("Linked List Visualizer - DSA Project");
        setSize(900, 300);
        setLayout(new BorderLayout());

        visualizer = new singlylinkedlist();
        panel = new LinkedListPanel(visualizer);

        // Control panel
        JPanel controls = new JPanel();

        JTextField valueField = new JTextField(6);

        JButton insertBtn = new JButton("Insert");
        JButton deleteBtn = new JButton("Delete Head");
        JButton searchBtn = new JButton("Search");

        controls.add(new JLabel("Value:"));
        controls.add(valueField);
        controls.add(insertBtn);
        controls.add(deleteBtn);
        controls.add(searchBtn);

        add(panel, BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);

        // Button actions
        insertBtn.addActionListener(e -> {
            try {
                int value = Integer.parseInt(valueField.getText());
                List<String> steps = visualizer.add(value);
                showSteps(steps);
                panel.refresh();
            } catch (Exception ex) {
                showError("Invalid input!");
            }
        });

        deleteBtn.addActionListener(e -> {
            List<String> steps = visualizer.delete();
            showSteps(steps);
            panel.refresh();
        });

        searchBtn.addActionListener(e -> {
            try {
                int value = Integer.parseInt(valueField.getText());
                List<String> steps = visualizer.search(value);
                showSteps(steps);
            } catch (Exception ex) {
                showError("Invalid input!");
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void showSteps(List<String> steps) {
        StringBuilder sb = new StringBuilder();
        for (String s : steps) sb.append(s).append("\n");

        JOptionPane.showMessageDialog(this, sb.toString(),
                "Algorithm Steps", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg,
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}

