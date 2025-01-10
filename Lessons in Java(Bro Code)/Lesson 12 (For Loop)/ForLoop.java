import java.util.Scanner;

public class ForLoop{

   public static void main (String [] args ){
   
   Scanner test = new Scanner (System.in);
   System.out.println("How many times do you want to count?");
   int x = test.nextInt();
   
   
   for(int i = 0; i <=x ; i++){
   //basis ; codition for the code to run; increment or decrement
   //i -=2, the decrement is done by 2's
   
   System.out.println(i);
   
   }
   //runs a block of code for a limited amount of times.
   
   } 

}