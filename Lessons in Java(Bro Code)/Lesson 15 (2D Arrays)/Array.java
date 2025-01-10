public class Array{

   public static void main (String [] args){

      //Row, Col
         String [] [] names = {
                              {"Allan", "Clara", "Ian"},
                              {"Leon", "Jaylord", "Dave"},
                              {"WeighKen", "Louie", "Edmar"},
                             };
         //Works for 2x2, 3x3, etc.
         //Array inside an array

         for (int i = 0; i < names.length; i++){
            System.out.println();
            for (int j=0; j < names.length; j++){
               System.out.print(names [i][j] + " ");
               }
         }
         
         //The forst for loop allows the console to write the backslash
         //The second step, 
         
   }

}