public class Human{

   private String name;
   private int age;
   private double weight;
   //Declared variables (Cannot be manipulated directly)

   Human(){
      this("null", 0, 0.0);
   }

   Human(String name, int age, double weight){
      this.name = name;
      this.age = age;
      this.weight = weight;
   }
   
   void checkInfo (){
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Weight: " + weight);
      
      //Prints out area depending on the location of the array.
   }
   
   void setName (String name) {
      this.name = name;
   }
   
   void setAge (int age){
      this.age = age;
   }
   
   void setWeight (double weight){
      this.weight = weight;
   }
   
   //Setters (setAge, setName, setWeight) manipulates the global variables, giving them their value
   
   String getName(){
      return name;
   }
   
   //Getters are the ones who set the values of private variables

}