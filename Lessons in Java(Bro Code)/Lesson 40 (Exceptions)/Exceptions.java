import java.util.Scanner;

public class Exceptions{
   public static void main (String [] args){
      
      //Exception:   an event that occurs during the execution of a program that,
      //             disrupts the normal flow of instruction
      
      Scanner num = new Scanner (System.in);
      
      try {
         System.out.println("Enter a number to divide: ");
         int x = num.nextInt();
         System.out.println("Enter a whole number to divide by: ");
         int y = num.nextInt();
         int z = x / y;
         
         System.out.print("Result: " + z);
         
      }  catch (ArithmeticException e){
            System.out.println("You cant divide a number by zero! IDIOT!");
         }
         // catch (InputMismatchException e){
//             System.out.print("Please enter a number.");
//          }
         catch (Exception e){
            System.out.print("Something went wrong");
         }
         finally {
            num.close();
         }
   }
}  