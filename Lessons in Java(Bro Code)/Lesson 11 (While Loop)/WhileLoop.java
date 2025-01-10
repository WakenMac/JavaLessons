import java.util.Scanner;

public class WhileLoop{

   public static void main (String [] args){
   
   Scanner ref = new Scanner (System.in);
   
   String name = "";
   
      while (name.isBlank()) {
      //A loop that repeats a block of code as long as the condition remains true
      
      System.out.println("Please enter your name");
      name = ref.nextLine();
      }
      
      System.out.println("Good day! Mr/Ms " + name);
   
   }

}