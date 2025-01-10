import java.util.Scanner;

public class MainHumanList{
   public static void main (String [] args){
   
   Scanner word = new Scanner (System.in);
   Scanner num = new Scanner (System.in);
   
   int limit;
   
   int age;
   String name;
   double weight;

      Human testHuman = new Human();
      System.out.println(testHuman.getName());
      
      System.out.print("Input number of Meat Shields to add: ");
      limit = num.nextInt();
      
      System.out.println();
      
      Human [] human = new Human [limit];
      
         for (int i = 0; i <= (limit - 1); i++){
            human [i] = new Human();
            
            System.out.print("Input name: ");
            name = word.nextLine();
            human[i].setName(name);
            //Sets unique location for the name in the array
            
            System.out.print("Input age: ");
            age = num.nextInt();
            human[i].setAge(age);
            //Sets unique location for the age
            
            System.out.print("Input weight: ");
            weight = num.nextDouble();
            human[i].setWeight(weight);
            //Sets unique location for the weight
            
            System.out.println();
         }
         
         for (Human h : human){
            h.checkInfo();
            //Checks Information from the location (h) in the Array
         }
               
   }
}