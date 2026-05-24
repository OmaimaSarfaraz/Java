package Dsaconceptvisualizer;

import java.awt.*;
import javax.swing.*;

public class SortingPanel extends JPanel {

    private int[] arr;

    public void setArray(int[] arr) {
        this.arr = arr;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (arr == null) return;

        int x = 20;
        for (int i = 0; i < arr.length; i++) {
            g.setColor(Color.BLACK);
            g.drawRect(x, 50, 60, 60);

            g.setFont(new Font("Arial", Font.BOLD, 18));
            g.drawString(String.valueOf(arr[i]), x + 22, 85);

            g.setFont(new Font("Arial", Font.PLAIN, 12));
            g.drawString("[" + i + "]", x + 20, 130);

            x += 80;
        }
    }
}
