import java.util.Random;

public class Randomizer{

   public static void main (String [] args ){
   
   Random dice = new Random ();
   
   int x = dice.nextInt(6)+1;
   //Remember, when using a randomizer with numbers, computer counts always start with 0
   //If you place a limit of 6, the set that will be created will be form 0 upto 5 only.
   //To avoid getting a 0 value, you can add an operator as seen above.
   
   if (x >= 5)
   System.out.println("CRITICAL HIT!");
   
   if (x <=3)
   System.out.println("UNLUCKY MF");
   
   double y = dice.nextDouble();
   
   System.out.print(x);
   System.out.print("\n" + y);
   
   }

}