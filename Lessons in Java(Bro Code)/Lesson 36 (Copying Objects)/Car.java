public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    //Overloaded Constructor
    Car (Car x){
      this.copy(x); //Continues to use the copy method found inside of this class.
                    //"this" keyword is used when referring to a method inside a method.
    }
    
    public String getMake(){
      return this.make;
    }
    
    public String getModel(){
      return this.model;
    }
    
    public int getYear(){
      return this.year;
    }
    
    public void setMake (String make){
      this.make = make;
    }
    
    public void setModel (String model){
      this.model = model;
    }
    
    public void setYear (int year){
      this.year = year;
    }
    
    public void copy(Car x){
      // this.make = x.getMake();
//       this.model = x.getModel();
//       this.year = x.getYear();
      this.setMake(x.getMake());
      this.setModel(x.getModel());
      this.setYear(x.getYear());
    }
}
