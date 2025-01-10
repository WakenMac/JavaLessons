public class Main{
    public static void main (String [] args){
        //Method overriding = Declaring a method in a subclass
        //                    which is already present in the parent class
        //                    It is done so that a child class can give its own implementation
        
        //                    The child class has its own version of its inherrited method from the parent class

        Animal animal = new Animal();
        Dog dog = new Dog();
        Flynn flynn = new Flynn();

        animal.speak();
        dog.speak();
        flynn.go();
    }
}