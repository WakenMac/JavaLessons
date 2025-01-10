public class Bicycle extends Vehicle{
    
    int doors = 0;
    int wheels = 2;

    @Override
    public void go(){
        super.go();
        System.out.println("I am a bicycle");
    }
}
