import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");
    JButton button2 = new JButton("Okay");
    JLabel label = new JLabel("Enter your name:");
    JLabel showName = new JLabel();
    JPanel panel = new JPanel();

    /*
     * Enter name gui
     *      submit button
     *      textfeild
     *      label
     * Show name gui
     *      Remove previous components
     *      continue button
     *      label to show name
     * Repeat
     */

    MyFrame(){
        this.setTitle("");
        this.setLayout(null);
        this.setSize(400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        label.setForeground(Color.black);
        label.setFont(new Font("Montserrat", Font.BOLD, 20));
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(10, 10, 250, 35);

        showName.setForeground(Color.black);
        showName.setFont(new Font("Montserrat", Font.BOLD, 20));
        showName.setHorizontalTextPosition(JLabel.LEFT);
        showName.setHorizontalAlignment(JLabel.LEFT);
        showName.setBounds(10, 10, 400, 35);

        textField.setPreferredSize(new Dimension(250, 35));
        textField.setBounds(10, 60, 250, 35);
        textField.setFont(new Font("Montserrat", Font.PLAIN, 18));

        button.setBounds(270, 60, 100, 35);
        button.setFocusable(false);
        button.addActionListener(this);

        button2.setBounds(270, 60, 100, 35);
        button2.setFocusable(true);
        button2.addActionListener(this);

        this.add(label);
        this.add(textField);
        this.add(button);

        while (true){
            System.out.println(this.getSize());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            showName.setText("Nice to meet you!, " + textField.getText());
            this.getContentPane().removeAll();
            this.add(button2);
            this.add(showName);
            this.revalidate(); //Checks the component heirarchy
            this.repaint(); //Replaints or re-add the existing components of the gui
        }

        else if (e.getSource() == button2){
            textField.setText("");
            this.getContentPane().removeAll();
            this.add(label);
            this.add(textField);
            this.add(button);
            this.revalidate();
            this.repaint();
        }
    }

}
