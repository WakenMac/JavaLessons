import javax.swing.JOptionPane;

public class GUI {

   public static void main (String [] args){
   
      String fname = JOptionPane.showInputDialog("Enter your first name");
      String lname = JOptionPane.showInputDialog("Enter your last name");
      /* 
      Format to imput dialog for String data types:
      String (Name) = JOptionPane.showInputDialog("Input Text Here");
      */
      
      int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
      
      if (age <= 18){
      JOptionPane.showMessageDialog(null, "Java User Interface INACCESSIBLE");
      
      }
      
         else {
         JOptionPane.showMessageDialog(null, "Good day, " + fname + " " + lname);
         JOptionPane.showMessageDialog(null, "Please enter your password");

         }
         
      String pass = (JOptionPane.showInputDialog("Just copy this: (HELLO)"));
      
      if (pass == "HELLO") {
      }
      
         else {
         JOptionPane.showMessageDialog (null, "User credentials are INCORRECT");
         }
      
   }

}