import javax.swing.*;

public class Graphics2D_Main {
    
    JFrame frame;
    MyPanel panel;

    public Graphics2D_Main(){
        frame = new JFrame("2D Graphics");
        panel = new MyPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String [] args){
        new Graphics2D_Main();
    }



}
