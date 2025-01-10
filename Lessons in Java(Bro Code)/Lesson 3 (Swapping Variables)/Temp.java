import java.util.Scanner;

public class Temp{

   public static void main (String [] args){
   
   Scanner input = new Scanner (System.in);
   
   String x;
   String y;
   
   System.out.println("Input value for x");
   x = input.nextLine();
   
   System.out.println("Input value for y");
   y = input.nextLine();
   
   String temp;
   //Temp aka temporary is a variable that allows other variable's value to be stored by it, as seen below
   temp = x;
   x = y;
   y = temp;
   /*1st line, the the value of x is now stored in temp, making x have no value
   * 2nd line, the value of x is now the same as the value of y
   * 3rd line, the value of y is now the same as the value of temp
   * Thus the values of both variables have been swapped
   */
   
   System.out.println("x: " + x);
   System.out.println("y: " + y);
   
   }

}