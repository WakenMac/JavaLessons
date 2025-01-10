import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MouseListener_Main extends MouseAdapter{
    
    JFrame frame;
    JLabel label, description;
    Random dice;

    public MouseListener_Main(){
        frame = new JFrame("Random Number");
        label = new JLabel("0");
        description = new JLabel("Press the box for a random number");
        dice = new Random();

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        label.setBounds(150, 120, 90, 90);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Helvetica", Font.BOLD, 60));
        label.setOpaque(false);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        label.addMouseListener(this);

        description.setBounds(40, 250, 300, 60);
        description.setForeground(Color.BLACK);
        description.setFont(new Font("Helvetica", Font.BOLD, 17));
        description.setOpaque(false);
        description.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.add(description);
        frame.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e){
        label.setText(Integer.toString(generateNumber()));
        refresh();
    }

    public int generateNumber(){
        return dice.nextInt(11);
    }

    public void refresh(){
        frame.getContentPane().repaint();
        frame.getContentPane().revalidate();
    }

    public static void main (String [] args){
        new MouseListener_Main();
    }

}
