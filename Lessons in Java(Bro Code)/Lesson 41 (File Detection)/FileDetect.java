import java.io.File;

public class FileDetect {
   public static void main (String [] args){
      
      //file:  Abstract representation of file and directory pathnames
      
      File file = new File ("secret_message.txt");
      
      if (file.exists()){
         System.out.println("That file exists");
         System.out.println(file.getPath());
         System.out.println(file.getAbsolutePath()); //Gets full file path
         //file.setAbsolutePath("/Users/My Pc/Downloads/USEP BSCS/Coding/JGrasp/Lessons in Java(Bro Code)/Lesson 42 (File Writer)/secret_message.txt");
         System.out.println(file.isFile()); //Finds if selected file name is a file and not a folder
         //file.delete();
      }  else {
            System.out.println("That file doesnt exists");
         }
   }
}