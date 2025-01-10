import java.util.Scanner;

public class MathClass{

   public static void main (String [] args){
   
   Scanner math = new Scanner (System.in);
   
   double x;
   double y;
   double z;
   
   //Set the variables to be used
   
   String unit;
   
   System.out.println("Welcome to the Triangle Hypotenuse Calcdulator!");
   System.out.println("Please indicate the unit to be used for the calculation");
   
   unit = math.nextLine();
   
   System.out.println("Please input the length of the first side");
   
   x = math.nextInt();
   
   System.out.println("Please input the length of the other side");
   y = math.nextInt();
   
   z = Math.sqrt((x*x)+(y*y));
   //Set the operation to be used
   //Math.(operation) (values)
   //max = chooses highest number
   //min = chooses smallest number
   //abs = Gives the absolute value of a number
   //round = above 5, rounds up
   //ceil =  round up
   //floor = round down
   
   System.out.println("The hypotenuse of the triangle is " + z + " " + unit);
   
   }
   
}   