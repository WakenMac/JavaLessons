public class Polymorphism {
   public static void main (String [] args){
      
      //Polymorphism:   greek word for poly (may) and morph (form)
      //                The ability of an object to identify to identify as more than one type
      
      Car car = new Car();
      Bicycle bike = new Bicycle();
      Boat boat = new Boat();
      
      Vehicle [] racers = {car, bike, boat}; //Racers object having the ability to identify as different types
      
      for (Vehicle x : racers){
         x.go();
      }
   }
}
