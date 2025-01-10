import javax.swing.*;
import java.awt.*;

public class TwoDAnimations_Main {
    
    JFrame frame;
    TwoDAnimations_MyPanel panel;

    public TwoDAnimations_Main(){
        frame = new JFrame("Animations Test");
        frame.setSize(600, 600);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new TwoDAnimations_MyPanel();

        addComponents(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void addComponents(Component... components){
        for (int i = 0; i < components.length; i++){
            frame.add(components[i]);
        }
    }
    
    public static void main (String [] args){
        new TwoDAnimations_Main();
    }
}
