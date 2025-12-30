package Dsaconceptvisualizer;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class StackPanel extends JPanel {

    private Stack stack;
    private JTextArea stepsArea;

    // fixed: constructor accepts an existing Stack object
    public StackPanel(Stack stack) {
        this.stack = stack;
        setLayout(new BorderLayout());

        // Controls
        JPanel controlPanel = new JPanel();
        JTextField input = new JTextField(5);
        JButton pushBtn = new JButton("Push");
        JButton popBtn = new JButton("Pop");
        JButton peekBtn = new JButton("Peek");

        controlPanel.add(new JLabel("Value:"));
        controlPanel.add(input);
        controlPanel.add(pushBtn);
        controlPanel.add(popBtn);
        controlPanel.add(peekBtn);

        // Steps
        stepsArea = new JTextArea(8, 30);
        stepsArea.setEditable(false);

        pushBtn.addActionListener(e -> {
            try {
                int value = Integer.parseInt(input.getText());
                showSteps(stack.push(value));
                repaint();
            } catch (Exception ex) {
                stepsArea.setText("Enter a valid number");
            }
        });

        popBtn.addActionListener(e -> {
            showSteps(stack.pop());
            repaint();
        });

        peekBtn.addActionListener(e -> {
            showSteps(stack.peek());
            repaint();
        });

        add(controlPanel, BorderLayout.NORTH);
        add(new JScrollPane(stepsArea), BorderLayout.SOUTH);
    }

    private void showSteps(List<String> steps) {
        stepsArea.setText("");
        for (String s : steps) {
            stepsArea.append(s + "\n");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 350;
        int y = 300;

        int[] arr = stack.getStack();
        int top = stack.getTop();

        for (int i = 0; i <= top; i++) {
            g.drawRect(x, y - i * 40, 60, 40);
            g.drawString(String.valueOf(arr[i]), x + 20, y - i * 40 + 25);
        }

        if (top >= 0) {
            g.drawString("TOP", x + 80, y - top * 40 + 25);
        }
    }
}
