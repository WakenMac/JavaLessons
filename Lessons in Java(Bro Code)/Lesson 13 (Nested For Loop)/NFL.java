import java.util.Scanner;

public class NFL{

   public static void main (String [] args ){
   
   Scanner ref = new Scanner (System.in);
   
   int rows;
   int columns;
   String symbol;
   
   System.out.println("Enter # of rows: ");
   rows = ref.nextInt();
   
   System.out.println("Enter # of columns: ");
   columns = ref.nextInt();
   
   System.out.println("Enter your symbol: ");
   ref.nextLine();
   symbol = ref.nextLine();
   
      for(int i=1; i <= rows; i++){
      System.out.println();
         for(int a=1; a<= columns; a++){
         System.out.print(symbol);
         }
      }
   
   }

}