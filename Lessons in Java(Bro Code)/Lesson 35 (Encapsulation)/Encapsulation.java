public class Encapsulation {
    
    public static void main (String [] args){
        //Encapsulation:   Attributes of a class will be hidden or private
        //                 Can only be accessed by using methods (getters and setters)
        //                 You should make attributes private if you don't have a reason to make them public or protected
      
        Car car = new Car ("Chevrolet", "Camaro", 2021);
        
        car.setMake("Suzuki");
        car.setModel("Celerio");
        car.setYear(2015);
        
        
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.print(car.getYear());
    }
}
