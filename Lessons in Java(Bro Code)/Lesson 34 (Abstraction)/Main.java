public class Main{
    /*Abstract: abstract classes are classes that cannot be instantiated, but can have a subclass, and 
                prevents users to input/select classes that are too general/vague/abstract.
                
                Forces the user to pick among a specific (child) class that inherits from the parent class.

                abstract methods are methods that are declared without implementation
                We need to implement the methods within the child class.
    */

    public static void main (String [] args){
        Car car = new Car();
        car.go();
        car.stop(); 
    }

}