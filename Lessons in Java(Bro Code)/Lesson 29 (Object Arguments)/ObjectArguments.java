import java.util.Scanner;

public class ObjectArguments{
   public static void main (String [] args){
   
   Scanner word = new Scanner (System.in);
   
      Garage garage = new Garage();
      //Reference - userDefined = new instantiated var
      
      Car car1 = new Car ("BMW");
      Car car2 = new Car ("Tesla");
      
      garage.park(car2);
   
   }
}