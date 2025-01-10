import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class KeyListener_Main implements KeyListener{
    
    JFrame frame;
    JLabel label;
    ImageIcon image;

    public KeyListener_Main(){
        frame = new JFrame("Rocket Game");
        image = new ImageIcon("Rocket.png");
        label = new JLabel(image);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(new Dimension(700, 700));
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setIconImage(image.getImage());
        frame.addKeyListener(this);

        label.setBounds(0, 0, 100, 100);
        label.setBackground(frame.getBackground());
        label.setOpaque(false);

        frame.add(label);
        frame.setVisible(true);
    }

    //Refreshes the frame when the user presses a key
    public void refresh(){
        frame.getContentPane().repaint();
        frame.getContentPane().revalidate();
    }

    public static void main (String [] args){
        new KeyListener_Main();
    }

    @Override
    public void keyTyped(KeyEvent e){
        switch(e.getKeyChar()){
            case 'w': 
                label.setLocation(label.getX(), label.getY() - 10);
                refresh();
                break;

            case 'a': 
                label.setLocation(label.getX() - 10, label.getY());
                refresh();
                break;

            case 's': 
                label.setLocation(label.getX(), label.getY() + 10);
                refresh();
                break;
            
            case 'd': 
                label.setLocation(label.getX() + 10, label.getY());
                refresh();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case 38: 
                label.setLocation(label.getX(), label.getY() - 10);
                refresh();
                break;

            case 37: 
                label.setLocation(label.getX() - 10, label.getY());
                refresh();
                break;

            case 40: 
                label.setLocation(label.getX(), label.getY() + 10);
                refresh();
                break;
            
            case 39: 
                label.setLocation(label.getX() + 10, label.getY());
                refresh();
                break;
        }
    }
}
