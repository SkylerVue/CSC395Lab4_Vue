import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class NewsDisplay extends JComponent {

    private int width;
    private int height;

    String toDraw = "HERE IT IS";
    String toDrawS = "HERE Stocks";
    String toDrawD = "HERE data";

    public NewsDisplay(int w, int h, String title) {
        width = w;
        height = h;
        JFrame f = new JFrame();
        f.setSize(w + 20, h + 20);
        f.setTitle(title);
        f.add(this);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    

    public void srepaint(String toDisplay) {
        toDrawS = toDisplay;
        repaint();
    }

    public void dataRedraw(String toDisplay) {
        toDrawD = toDisplay;
        repaint();
    }

    public void repaint(String toDisplay) {
        toDraw = toDisplay;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0 + 10, 0 + 10, width - 20, height - 20);
        g2d.setColor(Color.ORANGE);

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        g2d.drawString(toDraw, 40, 40);
        g2d.drawString(toDrawD, 40, 60);
        g2d.drawString(toDrawS, 40, 80);

    }



   // public void repaint(String string) {
   // }

}
