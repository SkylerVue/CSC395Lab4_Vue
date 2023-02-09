import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class NewsDisplay extends JComponent {

    private int width;
    private int height;

    String toDraw = "HERE IT IS";

    public NewsDisplay(int w, int h) {
        width = w;
        height = h;
        JFrame f = new JFrame();
        f.setSize(w+20, h+20);
        f.setTitle("Weather Station");
        f.add(this);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void StockDisplay(int w, int h) {
        width = w;
        height = h;
        JFrame f = new JFrame();
        f.setSize(w+30, h+25);
        f.setTitle("Stock Watcher");
        f.add(this);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


    public void DataDisplay(int w, int h) {
        width = w;
        height = h;
        JFrame f = new JFrame();
        f.setSize(w+35, h+30);
        f.setTitle("Database");
        f.add(this);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public void stockRedraw(String toDisplay) {
        String toDrawS = toDisplay;
        repaint();
    }
    public void dataRedraw(String toDisplay) {
        String toDrawD = toDisplay;
        repaint();
    }
    public void newsRedraw(String toDisplay) {
        toDraw = toDisplay;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0+10,0+10,width-20,height-20);
        g2d.setColor(Color.ORANGE);

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        g2d.drawString(toDraw, 40, 40);
        
    }

    // 3 redwith diff 
}
