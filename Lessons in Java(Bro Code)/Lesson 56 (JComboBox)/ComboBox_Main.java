import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox_Main implements ActionListener{

    JFrame frame;
    JComboBox <String> comboBox;
    String [] animals = new String [3];

    public ComboBox_Main(){
        animals[0] = "Dog"; animals[1] = "Cat"; animals[2] = "Birb";
        prepareComboBox();
        prepareFrame();
        addComponentsToFrame();
    }

    public void prepareComboBox(){
        comboBox = new JComboBox<String>(animals);
        comboBox.addActionListener(this);
        comboBox.setEditable(false);            //Turns the JComboBox into a JTextBox
        comboBox.addItem("Horse");               //Adds an item to the comboBox
                                                      //Doesnt add to the array of animals
        comboBox.insertItemAt("Pig", 0);   //Inserts an item at a specific index
        comboBox.setSelectedIndex(3);         //Sets the starting selected element in the JComboBox

        comboBox.removeItem("Pig");          //Removes the object
        comboBox.removeItemAt(1);             //Removes the object at a specific index
        comboBox.removeAllItems();                    //Removes all elements in the ComboBox

        comboBox = new JComboBox<String>(animals);
        comboBox.insertItemAt("Pig", 0);
        comboBox.addItem("Horse");

        System.out.println("String array length: " + animals.length);
        System.out.println("ComboBox item count: " + comboBox.getItemCount()); //Prints the number of elements in the JComboBox
        System.out.println(comboBox.getItemAt(1)); //Prints the element at the passed index
    }

    public void prepareFrame(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
    }

    public void addComponentsToFrame(){
        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String [] args){
        new ComboBox_Main();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}