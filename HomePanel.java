package Dsaconceptvisualizer;

import java.awt.*;
import javax.swing.*;

public class HomePanel extends JPanel {

    public HomePanel(Main main) {
        // 8 rows: one label + 7 buttons
        setLayout(new GridLayout(8, 1, 20, 20));

        // Title
        JLabel title = new JLabel("DSA Concept Visualizer", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));

        // Buttons
        JButton arrayBtn = new JButton("Array Visualizer");
        JButton listBtn = new JButton("Linked List Visualizer");
        JButton stackBtn = new JButton("Stack Visualizer");
        JButton sortBtn = new JButton("Sorting Algorithm Visualizer");
        JButton queueBtn = new JButton("Queue Visualizer");
        JButton treeBtn = new JButton("Tree Visualizer");
        JButton exitBtn = new JButton("Exit");

        // Add action listeners
        arrayBtn.addActionListener(e -> main.showScreen("ARRAY"));
        listBtn.addActionListener(e -> main.showScreen("LIST"));
        stackBtn.addActionListener(e -> main.showScreen("STACK"));
        sortBtn.addActionListener(e -> main.showScreen("SORTING"));
        queueBtn.addActionListener(e -> main.showScreen("QUEUE"));
        treeBtn.addActionListener(e -> main.showScreen("TREE"));
        exitBtn.addActionListener(e -> System.exit(0));

        // Add components
        add(title);
        add(arrayBtn);
        add(listBtn);
        add(stackBtn);
        add(sortBtn);
        add(queueBtn);
        add(treeBtn);
        add(exitBtn);
    }
}
