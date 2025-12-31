package Dsaconceptvisualizer;

import java.awt.*;
import javax.swing.*;

public class TreePanel extends JPanel {

    private TreeVisualizer.Node root;

    public void setRoot(TreeVisualizer.Node root) {
        this.root = root;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(root == null)
            return;

        try {
            draw(g, root, getWidth()/2, 40, 180);
        } catch(Exception e) {
            g.setColor(Color.RED);
            g.drawString("Error drawing tree: " + e.getMessage(), 10, 20);
        }
    }

    private void draw(Graphics g, TreeVisualizer.Node node, int x, int y, int gap) {

        if(node == null)
            return;

        try {
            g.setColor(Color.BLACK);
            g.fillOval(x-20, y-20, 40, 40);
            g.setColor(Color.WHITE);
            g.drawString("" + node.data, x-6, y+5);

            if(node.left != null) {
                g.setColor(Color.BLACK);
                g.drawLine(x, y, x-gap, y+70);
                draw(g, node.left, x-gap, y+70, gap/2);
            }

            if(node.right != null) {
                g.setColor(Color.BLACK);
                g.drawLine(x, y, x+gap, y+70);
                draw(g, node.right, x+gap, y+70, gap/2);
            }
        } catch(Exception e) {
            g.setColor(Color.RED);
            g.drawString("Error drawing node: " + e.getMessage(), x, y);
        }
    }
}