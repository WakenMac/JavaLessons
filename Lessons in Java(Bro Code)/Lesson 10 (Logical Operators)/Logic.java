import java.util.Scanner;

public class Logic{

   public static void main (String [] args){
   
   Scanner C = new Scanner (System.in);
   
   System.out.println("Please input the current temperature");
   int temp = C.nextInt();
   
   //Logical operators are used to connect two or more expressions
   //&& means that both conditions must be true
   //|| means "or" /  either conditions must be true
   //!= means "Not Equal", and is mostly used in boolean type conditionals
   
      if (temp > 36){
      System.out.println("It is burning outside, you can turn into a Nigg-");
      }
      
      else if (temp>25 && temp<36){
      System.out.println("the temperature is fine today, not too hot, not too cold either");
      } 
      
      else if (temp<25 && temp >19){
      System.out.println("Might wanna wear a coat or thick jacket bro.");
      }
      
      else if (temp<15){
      System.out.println("Frosty bro?, got em brittle fingers, I think you lost some of em");
      }
      
   }

}