public class Person {
    String name;
    int age;
    
    Person (){
      this.name = "Batman";
      this.age = 10;
    }
    
    public String toString (){
      return this.name + "\n" + this.age + "\n";
    }
}