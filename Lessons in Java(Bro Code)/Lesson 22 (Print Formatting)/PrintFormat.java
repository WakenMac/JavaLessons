public class PrintFormat{
   public static void main (String [] args){
   
   System.out.printf("%d This is a format string %d", 123, 143);
   System.out.println();
   
   /*printf 
      method to control, format, and display text to the console window
      two arguments: format string + obj/var/value
      % [flags] [precision] [width] [conversion-character]
      
      contains format specifiers
      prints values only ONCE
      
      conversion characters:
      %b for boolean
      %c for char
      %d for int
      %f for doubles
      %s for string
      
      width (number of characters to be written as an output)
      precision (number of decimal place value)
      
      flags:
      - Left justify
      + output a plus (+) or minus (-) sign for a numeric value
      0 numeric values are zero padded
      , comma groupings if numbers > 1000
      
   */
   
   boolean sample = true;
   char myChar = 'a';
   String myString = "Hello";
   int myInt = 5000;
   double myDouble = 1000000000.3;
   
      System.out.printf("%b %c %5s %d %.0f", sample, myChar, myString, myInt, myDouble);
      System.out.println();
      
      System.out.printf("%,+.1f", myDouble); //Results in +1,000
   
   }
}