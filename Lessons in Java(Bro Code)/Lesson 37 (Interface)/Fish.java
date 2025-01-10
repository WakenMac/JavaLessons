public class Fish implements Prey, Predeator{
   
   @Override
   public void flee (){
      System.out.println("*This Fish is running away*");
   }
   
   @Override
   public void hunt(){
      System.out.println("*This Fish is hunting smaller fishes*");
   }
}