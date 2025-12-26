package Dsaconceptvisualizer;
import java.awt.*;
import javax.swing.*;

public class QueuePanel extends JPanel {

    private int[] queue;

    public void setQueue(int[] queue) {
        this.queue = queue;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(queue==null)
            return;

        int x = 30;

        for(int i=0;i<queue.length;i++) {

            g.setColor(Color.BLACK);
            g.drawRect(x, 60, 60, 60);

            if(queue[i] != -1) {
                g.setFont(new Font("Arial", Font.BOLD, 16));
                g.drawString("" + queue[i], x + 22, 95);
            }

            g.setFont(new Font("Arial", Font.PLAIN, 12));
            g.drawString("[" + i + "]", x + 20, 135);

            x += 80;
        }
    }
}