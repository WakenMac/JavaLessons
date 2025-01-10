public class Overload{

   public static void main (String [] args){
   
   System.out.println(add(5, 10, 15, 20));
   
   }//void main
   
      static int add (int x, int y) {
         System.out.println("This is overload method #1");
         int sum = x + y;
         return sum;
      }
      
      static int add (int x, int y, int z){
         System.out.println("This is overload method #2");
         int sum = x + y + z;
         return sum;
      }
      
      static int add (int x, int y, int z, int a){
         System.out.println("This is overload method #3");
         int sum = x + y + z + a;
         return sum;
      }

}//public class