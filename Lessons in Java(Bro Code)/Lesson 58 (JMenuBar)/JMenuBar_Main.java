import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuBar_Main implements ActionListener{

    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem loadItem, saveItem, exitItem;

    public JMenuBar_Main(){
        frame = new JFrame();
        menuBar = new JMenuBar();

        //Tabs to be added to the menu bar
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        fileMenu.setMnemonic(KeyEvent.VK_F); //Need to hold Alt + key assigned, for it to work
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        //Inner tabs to be added to the JMenu
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loadItem){
                System.out.println("File loaded!");
        }   else if (e.getSource() == saveItem){
                     System.out.println("File saved!");
            }   else {
                     System.exit(0);
                }
    }

    public static void main (String [] args){
        new JMenuBar_Main();
    }
}