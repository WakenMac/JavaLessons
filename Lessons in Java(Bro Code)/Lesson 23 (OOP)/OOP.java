import java.util.ArrayList;
import java.util.Scanner;

public class OOP{
   public static void main (String [] args){
      
      Scanner word = new Scanner (System.in);
      
      Car myCar = new Car();
      //creates a variable for the class
      
      System.out.println(myCar.year);
      System.out.printf("I own a %d %s, %s\n", myCar.year, myCar.model, myCar.color);
      
      myCar.drive();
      myCar.breaK();
      
      
      
   }
}