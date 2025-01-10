public class Main {
    
    public static void main (String [] args){
        //Super : refers to the superclass (parent) of an object
        //        very similar to the "this" keyword
        
        //super -> this.extendedFile
        //Gets the data of the parent

        Hero hero1 = new Hero ("Money");
        
        // System.out.println(hero2.toString());
        
        System.out.println(hero1.toString() + "\n");
        hero1.printDetails();
        
    }
    
}
