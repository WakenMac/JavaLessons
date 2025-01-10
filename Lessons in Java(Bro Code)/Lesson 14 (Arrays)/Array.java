import java.util.Scanner;

public class Array{

   public static void main (String [] args){
   
   Scanner num = new Scanner (System.in);
   
   String [] cars = {"Ferarri", "BMW", "Ford", "Mustang"};
   
   //DataType [] userdefined name = {LIST}
   //Datatype [] cars = new Datatype [number]
   
   System.out.println(cars[3]);
   
   String [] food = new String [6];
   
   food [0] = "Rice";
   food [1] = "Hotdog";
   food [2] = "Meatball";
   food [3] = "Ampalaya";
   food [4] = "Chicken Skin";
   food [5] = "Chocolate Chip Cookie";
   
   System.out.println(food[3]);
   
      for (int i=0; i < food.length; i++){
         System.out.println(food[i]); 
      }
      
   String [] name = {"Kent", "Ken", "Jiffrey", "Stellar", "Waks"}; //0 - 4
   
   System.out.print("What order: ");
   int choice = num.nextInt();
   choice--;
   
   System.out.print(name[choice]);
      
   
   }

}

