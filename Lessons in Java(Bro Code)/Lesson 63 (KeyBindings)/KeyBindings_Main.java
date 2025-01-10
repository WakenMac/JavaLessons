import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyBindings_Main {
    
    JFrame frame;
    JLabel label;
    InputMap inputMap;
    ActionMap actionMap;

    Action upAction, downAction, leftAction, rightAction;

    public KeyBindings_Main(){
        frame = new JFrame("Game");
        label = new JLabel();
        inputMap = label.getInputMap();
        actionMap = label.getActionMap();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        label.setBounds(0, 0, 40, 40);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        //label.requestFocus(true);

        initializeAndBindKeys();

        frame.add(label);
        frame.setVisible(true);
    }

    public static void main (String [] args){
        new KeyBindings_Main();
    }

    public void initializeAndBindKeys(){
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        bindKey("UP", "upAction", upAction);
        bindKey("DOWN", "downAction", downAction);
        bindKey("LEFT", "leftAction", leftAction);
        bindKey("RIGHT", "rightAction", rightAction);
        bindKey('w', "upAction", upAction);
        bindKey('s', "downAction", downAction);
        bindKey('a', "leftAction", leftAction);
        bindKey('d', "rightAction", rightAction);
    }

    public void bindKey(String keyStroke, String className_String, Action className){
        inputMap.put(KeyStroke.getKeyStroke(keyStroke), className_String);
        actionMap.put(className_String, className);
    }

    public void bindKey(Character keyStroke, String className_String, Action className){
        inputMap.put(KeyStroke.getKeyStroke(keyStroke), className_String);
        actionMap.put(className_String, className);
    }

    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
