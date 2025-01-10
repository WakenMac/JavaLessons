public class Expression{

   public static void main (String [] args){
   
   double friends = 10;
   friends = friends + 1;
   /*You can alter the value of variables through the use of Expression
   * Expression = Operands & operators
   * Operands = values/variables/numbers/quantity
   * Operators = + - * / %
   * Note the "%" aka modulus shows the remainder
   * Operators can be done several times
   */
   
   friends = friends - 6;
   friends = friends * 2;
   friends = friends % 3;
   
   friends++;
   //Increment is a shortcut to manually using operators
   
   
   friends = friends + 7;
   friends = friends / 2;
   //Division with non multiples result with a whole number result with the decimal portion becomming redacted
   
   friends = friends *2;
   friends = (double) friends / 4;
   
   System.out.println(friends);
   
   }
   
}