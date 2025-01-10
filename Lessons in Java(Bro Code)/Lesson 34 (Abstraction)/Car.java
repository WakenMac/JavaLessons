public class Car extends Vehicles{

    @Override
    public void go () {
        System.out.println("The driver is driving the car");
    }

    @Override
    public void stop (){
        System.out.println("The driver stopped the car");
    } 

}