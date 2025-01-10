import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragAndDrop_Main extends JFrame{
    DragPanel dragPanel;

    public DragAndDrop_Main(){
        this.setTitle("Drag and Drop");
        dragPanel = new DragPanel();

        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.add(dragPanel);
        this.setVisible(true);
        this.getContentPane().repaint();
        this.getContentPane().revalidate();
    }

    public static void main (String [] args){
        new DragAndDrop_Main();
    }

}
