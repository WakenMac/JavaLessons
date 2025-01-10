import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class TwoDAnimations_MyPanel extends JPanel{
    
    private final int WIDTH = 500, HEIGHT = 500;
    private int xVelocity = 3, yVelocity = 1;
    private int x = 0, y = 0;
    private Image background, enemy;
    private BufferedImage backgroundCache;
    private Graphics2D g2d;
    private Timer timer;

    public TwoDAnimations_MyPanel(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

        background = new ImageIcon("outer_space.png").getImage();
        enemy = new ImageIcon("diamond.png").getImage();
        cacheBackground();

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (x >= WIDTH - enemy.getWidth(null) || x < 0)
                    xVelocity *= -1;
                
                if (y >= HEIGHT - enemy.getHeight(null) || y < 0)
                    yVelocity *= -1;

                x += xVelocity;
                y += yVelocity;
                repaintEnemyArea();
            }
        });

        timer.start();

        
    }

    public void cacheBackground(){
        backgroundCache = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        Graphics2D cacheG2D = backgroundCache.createGraphics();
        cacheG2D.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        cacheG2D.dispose();
    }

    public void repaintEnemyArea(){
        cacheBackground();
        repaint(x, y, 100, 100);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        g2d = (Graphics2D) g;
        g2d.drawImage(backgroundCache, 0, 0, this);
        g2d.drawImage(enemy, x, y, this);
    }
}
