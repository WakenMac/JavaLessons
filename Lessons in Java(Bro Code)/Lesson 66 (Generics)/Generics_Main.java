public class Generics_Main {
    
    /*
     * Generics: 
     *  enables types (classes or interfaces) to be parameters when defining 
     *  classes, interfaces, and methods.
     *  
     *  Removes the need to create multiple versions of methods/classes for various data types
     *  Uses one version for all reference data types
     * 
     * Bounded Types:
     *  Ability to create the objects of a generic class to have data of specific derived
     *  types. (e.g. Number)
     */

    static Integer [] intArray = {1, 2, 3, 4, 5};
    static Double [] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
    static Character [] charArray = {'a', 'b', 'c', 'd', 'e'};
    static String [] stringArray = {"B", "Y", "E"};


    static MyGenericClass <Integer, Double> myInt = new MyGenericClass <Integer, Double>(5, 5.55);
    //static MyGenericClass <String, Character> myDouble = new MyGenericClass <>("Nice Game", 'E');


    public static void main (String [] args){
        displayArray(intArray);
        System.out.println();
        System.out.println(getLast(doubleArray));
        
        System.out.println(myInt.getUValue());
        //System.out.println(myDouble.getTValue());
    }

    //Syntax for a generic method
    public static <T> void displayArray(T [] objArray){
        for (int i = 0; i < objArray.length; i++){
            System.out.print(objArray[i] + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T [] objArray){
        return objArray[0];
    }

    public static <T> T getLast(T [] objArray){
        return objArray[objArray.length - 1];
    }

    // public static void displayArray(Integer [] array){
    //     for (int i  = 0; i < array.length; i++){
    //         System.out.print(array[i] + " ");
    //     }
        
    //     System.out.println();
    // }
}
