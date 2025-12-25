package Dsaconceptvisualizer;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class LinkedlistScreen extends JPanel {

    private Main main;
    private singlylinkedlist list;
    private LinkedListPanel listPanel;

    public LinkedlistScreen(Main main, singlylinkedlist list) {
        this.main = main;
        this.list = list;

        setLayout(new BorderLayout());

        // panel
        listPanel = new LinkedListPanel(list);

        // ---------- CONTROLS ----------
        JPanel controls = new JPanel();
        JTextField valueField = new JTextField(6);

        JButton insertBtn = new JButton("Insert");
        JButton deleteBtn = new JButton("Delete Head");
        JButton searchBtn = new JButton("Search");
        JButton back = new JButton("Back");

        controls.add(new JLabel("Value:"));
        controls.add(valueField);
        controls.add(insertBtn);
        controls.add(deleteBtn);
        controls.add(searchBtn);
        controls.add(back);

        // ---------- ACTIONS ----------
        insertBtn.addActionListener(e -> {
            try {
                int v = Integer.parseInt(valueField.getText());
                showSteps(list.add(v));
                listPanel.refresh();
            } catch (Exception ex) {
                showError("Invalid input");
            }
        });

        deleteBtn.addActionListener(e -> {
            showSteps(list.delete());
            listPanel.refresh();
        });

        searchBtn.addActionListener(e -> {
            try {
                int v = Integer.parseInt(valueField.getText());
                showSteps(list.search(v));
            } catch (Exception ex) {
                showError("Invalid input");
            }
        });

        back.addActionListener(e -> main.showScreen("HOME"));

        // ---------- ADD ----------
        add(listPanel, BorderLayout.CENTER);
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
