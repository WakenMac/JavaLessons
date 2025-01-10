import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class JColorChooser_Main {
    
    JFrame frame;
    JButton button;
    JLabel label;
    Color color;

    public JColorChooser_Main(){
        frame = new JFrame();
        label = new JLabel("You can change the color of this text");
        button = new JButton("Pick a color");
        color = new Color(0);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);

        label.setBackground(Color.WHITE);
        label.setFont(new Font("Helvetica", Font.BOLD, 70));
        label.setOpaque(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                color = JColorChooser.showDialog(null, "Pick a color", label.getForeground());
                label.setForeground(color);
            }
        });

        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String [] args){
        new JColorChooser_Main();
    }
}
