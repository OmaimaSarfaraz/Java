package Dsaconceptvisualizer;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class ArrayScreen extends JPanel {

    private Main main;
    private Array visualizer;       // backend
    private Arraypanel panel;       // panel

    public ArrayScreen(Main main) {
        this.main = main;
        setLayout(new BorderLayout());

        // backend + panel
        visualizer = new Array(7);
        panel = new Arraypanel();
        panel.setArray(visualizer.getArray());

        // ---------- CONTROLS ----------
        JPanel controls = new JPanel();

        JTextField indexField = new JTextField(5);
        JTextField valueField = new JTextField(5);

        JButton insertBtn = new JButton("Insert");
        JButton deleteBtn = new JButton("Delete");
        JButton searchBtn = new JButton("Search");
        JButton back = new JButton("Back");

        controls.add(new JLabel("Index:"));
        controls.add(indexField);
        controls.add(new JLabel("Value:"));
        controls.add(valueField);
        controls.add(insertBtn);
        controls.add(deleteBtn);
        controls.add(searchBtn);
        controls.add(back);

        // ---------- ACTIONS ----------
        insertBtn.addActionListener(e -> {
            try {
                int index = Integer.parseInt(indexField.getText());
                int value = Integer.parseInt(valueField.getText());
                showSteps(visualizer.insert(index, value));
                panel.setArray(visualizer.getArray());
            } catch (Exception ex) {
                showError("Invalid input");
            }
        });

        deleteBtn.addActionListener(e -> {
            try {
                int index = Integer.parseInt(indexField.getText());
                showSteps(visualizer.delete(index));
                panel.setArray(visualizer.getArray());
            } catch (Exception ex) {
                showError("Invalid input");
            }
        });

        searchBtn.addActionListener(e -> {
            try {
                int value = Integer.parseInt(valueField.getText());
                showSteps(visualizer.search(value));
            } catch (Exception ex) {
                showError("Invalid input");
            }
        });

        back.addActionListener(e -> main.showScreen("HOME"));

        // ---------- ADD ----------
        add(panel, BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);
    }

    private void showSteps(List<String> steps) {
        StringBuilder sb = new StringBuilder();
        for (String s : steps) sb.append(s).append("\n");
        JOptionPane.showMessageDialog(this, sb.toString());
    }

    private void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

