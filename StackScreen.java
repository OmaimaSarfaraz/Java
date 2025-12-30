package Dsaconceptvisualizer;

import java.awt.*;
import javax.swing.*;

public class StackScreen extends JPanel {

    private Stack stack;       // shared stack
    private StackPanel panel;  // panel for visualization

    public StackScreen(Main main, Stack stack) {
        this.stack = stack;
        setLayout(new BorderLayout());

        JButton back = new JButton("Back");
        back.addActionListener(e -> main.showScreen("HOME"));

        // fixed: pass shared stack to panel
        panel = new StackPanel(stack);
        add(panel, BorderLayout.CENTER);
        add(back, BorderLayout.SOUTH);
    }
}
