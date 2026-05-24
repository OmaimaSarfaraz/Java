package Dsaconceptvisualizer;
import java.awt.*;
import java.util.List;
import javax.swing.*;

public class TreeScreen extends JPanel {

    private TreeVisualizer visualizer;
    private TreePanel panel;

    public TreeScreen(Main main) {
        setLayout(new BorderLayout());

        visualizer = new TreeVisualizer();
        panel = new TreePanel();

        JPanel controls = new JPanel();
        JTextField valueField = new JTextField(5);

        JButton insertBtn = new JButton("Insert");
        JButton deleteBtn = new JButton("Delete");
        JButton searchBtn = new JButton("Search");
        JButton bfsBtn = new JButton("BFS");
        JButton avlBtn = new JButton("Convert to AVL");
        JButton clearBtn = new JButton("Clear Tree");
        JButton backBtn = new JButton("Back");

        controls.add(clearBtn);
        controls.add(new JLabel("Value:"));
        controls.add(valueField);
        controls.add(insertBtn);
        controls.add(deleteBtn);
        controls.add(searchBtn);
        controls.add(bfsBtn);
        controls.add(avlBtn);
        controls.add(backBtn);

        add(panel, BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);

        insertBtn.addActionListener(e -> {
            try {
                int v = Integer.parseInt(valueField.getText());
                showSteps(visualizer.insert(v));
                panel.setRoot(visualizer.getRoot());
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid integer");
            }
        });

        deleteBtn.addActionListener(e -> {
            try {
                int v = Integer.parseInt(valueField.getText());
                showSteps(visualizer.delete(v));
                panel.setRoot(visualizer.getRoot());
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid integer");
            }
        });

        searchBtn.addActionListener(e -> {
            try {
                int v = Integer.parseInt(valueField.getText());
                showSteps(visualizer.search(v));
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid integer");
            }
        });

        bfsBtn.addActionListener(e -> showSteps(visualizer.bfs()));
        avlBtn.addActionListener(e -> {
            showSteps(visualizer.convertToAVL());
            panel.setRoot(visualizer.getRoot());
        });
        clearBtn.addActionListener(e -> {
            visualizer = new TreeVisualizer();
            panel.setRoot(visualizer.getRoot());
        });

        backBtn.addActionListener(e -> main.showScreen("HOME"));
    }

    private void showSteps(List<String> steps) {
        StringBuilder sb = new StringBuilder();
        for(String s: steps) sb.append(s).append("\n");
        JOptionPane.showMessageDialog(this, sb.toString());
    }
}
