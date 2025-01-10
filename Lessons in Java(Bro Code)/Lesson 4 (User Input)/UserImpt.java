import java.util.Scanner;
//Import java.utility.(Name of the class)
//This is to choose which among the data classes will be used by the scanner

public class UserImpt {

   public static void main (String [] args){
   
   Scanner reader = new Scanner (System.in );
   //Setting of the scanner
   //Scanner (name of scanner) = new Scanner (System.in); to have the data input in the console
   
   System.out.println("What is your first name?");
   String name = reader.nextLine();
   //Here, the program wont move unless a text is entered in the console
   /*scanner.nextLine(); notes that the scanner function will be used for the next line, thus requiring user inputing information
     depending on the data type (Words so the string data type is used)
   * The format of the line is (data type) (variable/name) = (name of scanner).(next)(associated command per data type)
   */
   System.out.println("What is your last name?");
   String lastname = reader.nextLine();
   
   System.out.println("Nice to meet you " + name + " " + lastname +", How old are you?");
   int age = reader.nextInt();
   //next.int makes that the user information input in the console is a whole integer
   
   System.out.println(name + " is " + age + " years old");
   
   System.out.print("\n");
   
   System.out.println("For your safety, type 1 character for your encrypted username");
   char username = reader.next().charAt(0);
   reader.nextLine();
   //The extra scanner line helps clear any backslash that ends any scanner console outputs
   //Backslashes are only cleared when answering strting data types
   
   System.out.println("If you're not a robot, what are the 6 digits of pi?");
   double pi = reader.nextDouble();
   
   if (pi == 3.14159){
   System.out.println("User VERIFIED");
   
   }
   
      else {
      System.out.println("Access DENIED");
      
      }
   
   
   }

}