import java.util.Scanner;

public class Exit{

   public static void main (String [] args){
   
   Scanner escape = new Scanner (System.in);
   
   System.out.println("Press Q twice to Quit the game");
   String x = escape.nextLine();
   
      if (x.equalsIgnoreCase("QQ")){
      System.out.print("Autosaving.");
      System.out.print(" .");
      System.out.print(" .");
      System.out.print(" .");
      System.out.print(" .");
      System.out.print(" .");
      System.out.print(" .");
      System.out.print(" .");
      System.out.print(" .");
      System.out.print(" .");
      System.out.print(" .");
      System.out.println(" .");
      System.out.print("Autosave complete");
      }
      
      else {
      System.out.println("The " + x + " character was pressed");
      }
   
   }

}