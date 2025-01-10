import java.io.*;

public class FileWriter_Practice{
   public static void main (String [] args){
   
   String content = 
   """
   Roses are red
   Vioets are blue
   I cant believe I met someone like you
   
   Your beauty makes me wonder
   Why you're incomparable to any other
   
   With Eyes as beautiful as the Stars
   
   Is it okay if I ask you,
   Can I have a date with you? """;
   
      try {
         //File file = new File("poem.txt"); //Creates a new copy of a file
         BufferedWriter bw = new BufferedWriter (new FileWriter("poem.txt"));
         //System.out.println(file.getAbsolutePath());
         bw.write(content); //Makes the user printout the content of a text (String)
         bw.close(); //Closes the writer 
                         //Similar to scanner.close();

         System.out.print(System.getProperty("user.dir"));
      }  catch (IOException e){
            e.printStackTrace();
         }
   }
}  