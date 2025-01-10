import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize_Main implements java.io.Serializable{
    /*
     * Steps to Deserialize object
     *      1. Declare your object
     *      2. Your class should implement the Serializable interface
     *      3. Add import java.io.Serializable
     *      4. FileInputStream fileIn = new FileInputStream(file path)
     *      5. ObjectInputStream in = new ObjectInputStream(fileIn)
     *      6. objectName = (Class) in.readObject();
     *      7. in.close(); fileIn.close();
     */
    public static void main (String [] args) throws IOException, ClassNotFoundException{
        Lesson77_User user = null;

        FileInputStream fileIn = new FileInputStream("UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (Lesson77_User) in.readObject();
        in.close();
        fileIn.close();

        for (int i = 0; i < user.array.length; i++){
            System.out.print(user.array[i] + " ");
        }

        System.out.println(user.password); //Returns null as the password variable is transient
        user.sayHello();
    }
}
