import java.util.Scanner;

public class StringMethod{

   public static void main (String [] args){
   
      Scanner ref = new Scanner (System.in);
      
      System.out.println("Please enter your name");
      String name = ref.nextLine();
      
      boolean result1 = name.equalsIgnoreCase("Bro");
      //ref variable.equals (?) compares the value of the two strings
      //Adding an IgnoreCase info ignores or bypasses case sensitivity
         System.out.println(result1);
      
      int result2 = name.length();
      //Counts the length of the word input
         System.out.println("The word " + name + " is " + result2 + " letters long");   
         
      System.out.print("Choose a number that correspods to your word: ");
         int refResult2 = ref.nextInt();
         ref.nextLine();
            refResult2 = refResult2 - 1;
            if (refResult2 <= result2){
               char result3 = name.charAt(refResult2);
               //ref variable.charAt chooses the number of the word base on the word length
               System.out.println("The letter based from the input number is " + result3);
            }
            
            else {
               System.out.println("INVALID NUMBER \n" + "The number input is greater than the word length");
            }
            
      int result4 = name.indexOf("C");
      result4 = result4 + 1;
      //Locates the corresponding numerical order of a specific word
      //ref variable.indexOf(letter)
         System.out.println(result4);
         
         //boolean result = name.isEmpty();
         //name.replace('?', '?');
         //name.toUpperCase();
         //name.toLowerCase();
         //name.trim();
         //Datatypee.toString()
         //Datatype.parseDatatype
         
            /* FROM STRING TO OTHER DATATYPE
                  Integer.parseInt(var name);
                  Double.parseDouble(var name);
                  Boolean.parseBoolean(var name);
            */
         
      String test = "10";
      boolean result5 = test.isEmpty();
      
      
   }

}