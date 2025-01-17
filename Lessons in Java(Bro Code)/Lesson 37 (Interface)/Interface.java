public class Interface {
   public static void main (String [] args){
      
      //Interface:   a template that can be applied to a class
      //             similar to inheritance, but specifies what a class has/must do
      //             classes can apply more than one interface, inheritance is limited to one superclass
      
      Rabbit rabbit = new Rabbit();
      rabbit.flee();
      
      Hawk hawk = new Hawk();
      hawk.hunt();
      
      Fish fish = new Fish();
      fish.hunt();
      fish.flee();
   }
}