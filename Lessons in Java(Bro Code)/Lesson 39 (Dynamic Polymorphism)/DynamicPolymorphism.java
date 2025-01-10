import java.util.Scanner;

public class DynamicPolymorphism {
   public static void main (String [] args){
      
      Scanner num = new Scanner (System.in);
      int choice;
      
      //Polymorphism:   Many shapes and forms
      //Dynamic:        After compilation (During runtime)
      
      //Ex: A Corvette = Identifies as a Corvette, Car, Vehicle, Object
      
      Animal animal;
      System.out.println("What animal do you want? \n1: Dog \n2: Cat \nChoice:");
      choice = num.nextInt();
      
      if (choice == 1){
         animal = new Dog();
         animal.sniff();
         animal.speak();
      }  else if (choice == 2){
            animal = new Cat();
            animal.speak();
         }  else {
               System.out.println("Invalid choice entered.");
            }
      
   }
}