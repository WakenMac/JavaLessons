public class Variables {
    
   public static void main (String [] args){
      
      /* int x;
      *Declaration (variable will be preceeded by its data type)
      *
      * x = 123;
      *Assignment (The Variable is assigned a specific value
      */
      
      int x = 123; 
      //Initialization
      //When listing variables follow the format: (Variable data type) (Name of variable) = value/character/sentence/boolean
      
      System.out.println(x);
      //Prints out in console the value within x which is 123
      //Note that the variable is not contained within quotations
      
      System.out.println("My number is also " + x);
      //You can print out strings together with a variable in this format aka. String Concatenation
      
      long y = 123456789012L;
      /*Values over 2 billion have to use the data type "Long"
      *Values under this data type must end with the capital character "L"
      */
      
      System.out.println("The raffle cash prize is now worth " + y);
      
      float z = 3.14159f;
      //Floats handles non-whole or decimal values, reaching upto 6-7 digits
      //Note that float value must ALWAYS end in "f"
      System.out.println("My wallet only have " + z);
      
      double a = 1.09762941445;
      //Double data type is similar to float but can handle digits from 15-16 long without ending the value with a letter
      
      System.out.println("Another person mentioned his money being only " + a);
      
      boolean b = true;
      //Booleans is a data type stating only true or false
      //Booleans also only have a size of 1 bit
      System.out.println("I guess what the person is telling is " +b);
      
      char Allan = '%';
      //in terms of the data type char, the variable doesnt pertain to letters/symbols alone
      //Surrounds the character in a single quotation
      System.out.println(Allan);
      
      String name = "Allan Tagle";
      //Reference data types begins with a capital letter
      System.out.println("Hello " + name);
      
      
   }
    
}