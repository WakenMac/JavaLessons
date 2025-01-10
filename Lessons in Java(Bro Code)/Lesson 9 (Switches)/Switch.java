import java.util.Scanner;

public class Switch{

   public static void main (String [] args ){
   
   Scanner day = new Scanner (System.in);
   System.out.println("Please input the day today");
   String x = day.nextLine();
   
      switch (x){
      //A statement that allows a variable to be tested for equality against a list of variables
      //Used when there are several if statements   
      
         case "Sunday": System.out.println("It is Sunday!");
         break;
         
         case "Monday": System.out.println("It is Monday!");
         break;
         
         case "Tuesday": System.out.println("It is Tuesday!");
         break;
         
         case "Wednesday" : System.out.println("It is Wednesday!");
         break;
         
         case "Thursday": System.out.println("It is Thursday!");
         break;
         
         case "Friday": System.out.println("It is Friday");
         break;
         
         case "Saturday": System.out.print("It is Saturday");
         break;
         
         default: System.out.println("But, " + x+ " is not a day tho?....");
      } 

   
   
   
   }

}