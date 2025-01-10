import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class JFileChooser_Main {
    
    JFrame frame;
    JButton button;
    JFileChooser fileChooser;
    File file;
    int response;

    public JFileChooser_Main(){
        response = 1;
        file = new File("");
        frame = new JFrame();
        button = new JButton("Select File");
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("C:\\Users"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == button){
                    response = fileChooser.showOpenDialog(null); //Returns an int:
                                                                        //0 -> file is chosen
                                                                        //1 -> Cancel option
                                                                        //-1 -> error occurred

                    if (response == JFileChooser.APPROVE_OPTION){
                        file = new File(fileChooser.getSelectedFile().getAbsolutePath()); //Gets the string file path from the "C:\" directory
                        System.out.println(file); //Prints out the file path
                    }
                }
            }
        });

        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String [] args){
        new JFileChooser_Main();
    }
}
