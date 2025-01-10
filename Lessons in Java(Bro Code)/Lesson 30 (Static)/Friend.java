public class Friend{

   String name;
   static int numberOfFriends;

   Friend(String name){
      this.name = name;
      numberOfFriends++;
   }

   static void displayFriends(){
      System.out.print("\nYou have " + numberOfFriends + " friends.");
   }

   void printName(){
      System.out.print(this.name);
   }
}