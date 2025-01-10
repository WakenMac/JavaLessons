//import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Practice {
    public static void main(String[] args) {
        
        //File Reader:  Reads the content of a file such as a stream of characters. One by One.
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read
        
        
        try {
            FileReader reader = new FileReader ("c:/Users/My Pc/Downloads/USEP BSCS/Coding/JGrasp/Lessons in Java(Bro Code)/Lesson 42 (File Writer)/poem.txt");
            int data = reader.read();

                while (data != -1){
                    System.out.print((char) data);
                    data = reader.read();
                }

            reader.close();
        }   catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }
    }
}
