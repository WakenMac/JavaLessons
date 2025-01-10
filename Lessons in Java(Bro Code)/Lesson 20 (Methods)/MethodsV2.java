public class MethodsV2{
   
   public static void main (String [] args){
      int age = 34;
      String name = "Theo";
      
      int x = 5;
      int y = 7;
      
      greetUser(name, age);
      
      int a = calcu(x, y);
      System.out.print("\n" + a);
      System.out.print("\n" + calcu(x, y));
      
      System.out.print("\n" + pangalan());
      
      
      
   }//void main
   
   static void greetUser (String name, int age){
      System.out.print("Hello " + name);
      System.out.print("\nYou are " + age + " years old.");
   }
   
   static int calcu (int x, int y){
      int z = x + y;
      return z; //result of the seperate method (value of calcu(x,y))
   }
   
   static String pangalan () {
      String z = "Dox";
      return "Doz";
   }
}//public class