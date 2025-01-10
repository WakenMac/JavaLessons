import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{

    public MyPanel(){
        this.setPreferredSize(new Dimension(500, 500));
    }
    /*
     * When using the paint method, any recently generated shapes/lines will 
     * overlap or overlay any previously generated shapes/lines
     */
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0, 0, 500, 500);       //Draws a line (startX, startY, endX, endY)
                                                        //Creates a straight line

        g2d.setPaint(Color.YELLOW);                                
        g2d.drawRect(2, 3, 100, 400);   //Draws a rectangle (x, y, width, height)
                                                         //Creates a rectangle (Not filled)
        g2d.fillRect(2, 3, 100, 400);

        g2d.setPaint(Color.PINK);
        g2d.drawOval(0, 0, 50, 50);     //Draws an oval /circle (x, y, width, height)
        g2d.fillOval(0, 0, 50, 50);

        g2d.setPaint(Color.RED);
        //Draws an arc (x, y, width, height, startAngle, archAngle)
        //Start angle determines the starting position of the arc when drawn (Similar to radians)
        //Arc Angle is similar to the radians/length of the arc
        g2d.drawArc(100, 100, 100, 100, 25, 260);
        g2d.fillArc(100, 100, 100, 100, 20, 270);

        int [] xPoints = {200, 250, 300}; //Coordinates of the points in the x-axis
        int [] yPoints = {400, 300, 400}; //Coordinates of the points in the y-axis
        g2d.setPaint(Color.ORANGE);
        g2d.drawPolygon(xPoints, yPoints, 3);
        g2d.fillPolygon(xPoints, yPoints, 3);

        g2d.setPaint(Color.MAGENTA);
        g2d.setFont(new Font("Helvetica", Font.BOLD, 30)); //Manipulates the font of the string to be generated
        g2d.drawString("I Like Turtles :D", 120, 50);        //Generates the string and its location

        Image image = new ImageIcon("cat.jpg").getImage();
        g2d.drawImage(image, 20, 20, 400, 400, null); //Method used to resize images
    }

}
