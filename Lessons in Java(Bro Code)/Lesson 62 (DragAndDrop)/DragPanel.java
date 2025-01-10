import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragPanel extends JPanel{
    ImageIcon image = new ImageIcon("Rocket.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPoint;

    public DragPanel(){
        imageCorner = new Point(0, 0);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                prevPoint = e.getPoint(); //Updates the previous point wherever we clicked
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e){
                Point currentPoint = e.getPoint();
                imageCorner.translate(
                        (int) (currentPoint.getX() - prevPoint.getX()),
                        (int) (currentPoint.getY() - prevPoint.getY())
                );

                prevPoint = new Point((int) currentPoint.getX(), (int) currentPoint.getY());
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    
}