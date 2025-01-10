import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgressBar_Main {
    JFrame frame;
    JProgressBar bar;

    public ProgressBar_Main(){
        frame = new JFrame();
        bar = new JProgressBar();
        
        bar.setValue(0);                                          //Sets the bar's starting value
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);                               //Shows a string / percentage of the progress bar
        bar.setFont(new Font("Arial", Font.BOLD, 20));
        bar.setForeground(Color.GREEN);                               //Sets the color of the progress bar
        bar.setBackground(Color.WHITE);                             //Sets the color of the background

        frame.setDefaultCloseOperation(3);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        frame.add(bar);
        frame.setVisible(true);

        fill();
    }

    public void refresh(){
        frame.getContentPane().repaint();
        frame.getContentPane().revalidate();
    }

    public void fill(){
        int counter = 0;

        while (counter++ <= 100){
            bar.setValue(counter);
            try{
                if (counter < 99) {Thread.sleep(100 - counter); }
            } catch (InterruptedException e){

            }
        }
    }

    public static void main (String [] args){
        new ProgressBar_Main();
    }
}
