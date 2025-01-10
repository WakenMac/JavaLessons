import java.util.Scanner;

public class Methods{

   public static void main (String [] args){
   
   Scanner num = new Scanner (System.in);
   
   //Methods are used to execute a block of code whenever it is called upon.
   boolean game = true;
   while (game == true){
         System.out.print("Mamili ka [1] or [2]: ");
         int choice = num.nextInt();
         
         if (choice == 1){
            int x = 3;
            int y = 5;
            hello(x, y);
         }
         
         else if (choice == 2){
            String name = "Theo";
            goodbye(name);
         }
      
   }
      }
      
      static void hello (int y, int x) {
         System.out.println("Hello" + " " + y + x);
      }
      
      //y serves as the placeholder for the first variable
      //x serves as the placeholder for the second variable
      
      static void goodbye (String z) {
         System.out.println("Goodbye " + z);
      }

}

/*
   void main:
   int x
   hello (x)
   
   static void hello (int x) {}
   Allows the seperate method to use the vatiable x.
   
   Note: NOT variable name sensitive
*/