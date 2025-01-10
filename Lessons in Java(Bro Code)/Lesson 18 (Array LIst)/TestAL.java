import java.util.ArrayList;

public class TestAL{

   public static void main (String [] args){
   
   //Array List (Resizable Array)
   //Only stores reference data types
   
   String [] otherFood = new String[2]; 
   ArrayList<String> food = new ArrayList<String>(2);
   //ArrayList <Reference data type> variableName = new ArrayList <data type>

   food.add("Hotdogs");       //0
   food.add("Pizza");         //1
   food.add("Hamburger");     
   food.add("ERROR");
   
   food.set(3, "Sushi");
   
   food.remove(1);
   
   System.out.println(food.get(2));
   System.out.println("");
   
      for (int i = 0; i < food.size(); i++){
         System.out.print(food.get(i));
         System.out.println("");
      }
      
   }

}