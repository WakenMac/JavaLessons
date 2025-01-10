import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener, MouseWheelListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    String basisLabel;

    public SliderDemo(){
        basisLabel = "Volume: ";
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50); //Min - Max - Middle values in the slider
                                                        //The last parameter is to determine where the slider is first placed when the 
                                                        //program starts

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTrack(true); //Prints the slider track (The horizontal shape)
                                      //Is true in the start

        slider.setPaintTicks(true); //Makes the ticks visible
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);

        slider.setFont(new Font("Arial", Font.BOLD, 20));
        slider.setPaintLabels(true); //Makes the paint labels visible
        slider.setOrientation(SwingConstants.HORIZONTAL); //Sets the orientation of the slider (.VERTICAL or .HORIZONTAL)
        slider.addChangeListener(this); //Adds the ChangeListener implemented in this class
        slider.addMouseWheelListener(this); //Adds the MouseWheelListener implemented in this class

        label.setFont(new Font("Arial", Font.BOLD, 25));
        label.setText(basisLabel + slider.getValue());

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void refreshFrame(){
        frame.getContentPane().repaint();
        frame.getContentPane().revalidate();
    }

    public static void main(String [] args){
        new SliderDemo();
    }

    @Override
    public void stateChanged(ChangeEvent e){
        label.setText(basisLabel + slider.getValue()); //Changes the label
        refreshFrame();
        //Slider.getValue gets the value the pointer is currently on in the slider
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e){
        int notches = e.getWheelRotation() * 2; //Returns a negative value if mouse wheel is moved up (Away from the user)
                                            //Returns a positive value otherwise (Moved towards the user)
        int oldValue = slider.getValue();
        int newValue = oldValue - notches;

        if(newValue < 0){ newValue = 0; }
        else if (newValue > 100){ newValue = 100; }
        
        slider.setValue(newValue);
    }
}
