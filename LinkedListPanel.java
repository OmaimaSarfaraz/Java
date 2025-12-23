package Dsaconceptvisualizer;

import javax.swing.*;
import java.awt.*;

public class LinkedListPanel extends JPanel {

    private singlylinkedlist visualizer; // your original lowercase class
    private singlylinkedlist.Node head;

    // No-argument constructor
    public LinkedListPanel() {
        this.visualizer = new singlylinkedlist(); // create empty linked list
        this.head = visualizer.head;
    }

    // Constructor with existing singlylinkedlist object
    public LinkedListPanel(singlylinkedlist visualizer) {
        this.visualizer = visualizer;
        this.head = visualizer.head;
    }

    public void refresh() {
        this.head = visualizer.head;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 20;
        int y = 80;
        singlylinkedlist.Node temp = head;

        while (temp != null) {
            // Draw node box
            g.drawRect(x, y, 60, 40);
            g.drawString(String.valueOf(temp.data), x + 25, y + 25);

            // Draw arrow
            if (temp.next != null) {
                g.drawLine(x + 60, y + 20, x + 90, y + 20);
                g.drawLine(x + 85, y + 15, x + 90, y + 20);
                g.drawLine(x + 85, y + 25, x + 90, y + 20);
            }

            x += 100;
            temp = temp.next;
        }

        if (head == null) {
            g.drawString("Linked List is Empty", 20, 80);
        }
    }
}
