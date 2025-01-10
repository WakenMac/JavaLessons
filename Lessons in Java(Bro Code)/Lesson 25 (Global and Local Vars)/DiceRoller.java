import java.util.Random;

public class DiceRoller{

   Random dice;
   int number = 0;
   
   DiceRoller(){
      dice = new Random();
   }
   
   //Follows instructions inside the constructor
   
   void roll () {
      number = dice.nextInt(6)+1;
      System.out.println(number);
   }

}