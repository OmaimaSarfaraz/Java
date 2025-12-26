package Dsaconceptvisualizer;
import java.awt.*;
import java.util.List;
import javax.swing.*;

public class QueueScreen extends JPanel {

    private QueueVisualizer visualizer;
    private QueuePanel panel;

    public QueueScreen(Main main) {  // pass Main for navigation if needed
        setLayout(new BorderLayout());

        visualizer = new QueueVisualizer(6);
        panel = new QueuePanel();
        panel.setQueue(visualizer.getQueue());

        JPanel controls = new JPanel();
        JTextField valueField = new JTextField(5);

        JButton enqueueBtn = new JButton("Enqueue");
        JButton dequeueBtn = new JButton("Dequeue");
        JButton searchBtn = new JButton("Search");
        JButton backBtn = new JButton("Back");

        controls.add(new JLabel("Value:"));
        controls.add(valueField);
        controls.add(enqueueBtn);
        controls.add(dequeueBtn);
        controls.add(searchBtn);
        controls.add(backBtn);

        add(panel, BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);

        enqueueBtn.addActionListener(e -> {
            try {
                int v = Integer.parseInt(valueField.getText());
                showSteps(visualizer.enqueue(v));
                panel.setQueue(visualizer.getQueue());
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid integer");
            }
        });

        dequeueBtn.addActionListener(e -> {
            showSteps(visualizer.dequeue());
            panel.setQueue(visualizer.getQueue());
        });

        searchBtn.addActionListener(e -> {
            try {
                int v = Integer.parseInt(valueField.getText());
                showSteps(visualizer.search(v));
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid integer");
            }
        });

        backBtn.addActionListener(e -> main.showScreen("HOME")); // go back
    }

    private void showSteps(List<String> steps) {
        StringBuilder sb = new StringBuilder();
        for(String s: steps) sb.append(s).append("\n");
        JOptionPane.showMessageDialog(this, sb.toString());
    }
}
