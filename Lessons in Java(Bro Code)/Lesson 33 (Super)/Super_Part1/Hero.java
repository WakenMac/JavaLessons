public class Hero extends Person {
    
    String power;
    
    Hero (String power){
      super(); //Refers to the method found in the parent class (Constructor with the given parameters)
                        //Initializes the data of the child class to the parent class
                        //Uses the implemented contructor found in the parent class and 
                        //  copies the data to the child class
      this.power = power;
      // this.name = name;
      // this.age = age;
    }
    
    @Override
    public String toString (){
      return super.toString() + this.power;
    }

    public void printDetails (){
      System.out.print("Name: " + super.name + "\nAge: " + super.age + "\nSuperpower: " + this.power);
    }
}
