import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable_Main{

    /*
     * Serialization:
     *      Process of converting an object into a byte stream
     *      Persists (saves the state) the object after the program exits
     *      The byte stream can be saved as a file or sent over a network
     *      Byte stream can be saved as (.ser) which is platform independent
     *      (Think of it as saving the file with the object's information)
     * 
     * Deserialization:
     *      Reverse process, wherein we convert the byte stream into an object
     *      (Think of it as if you're loading a save file)
     * 
     * Steps to serialize:
     *      1. Your object class should implement the Serializable interface
     *      2. Add import java.io.Serializable
     *      3. FileOutputStream fileOut = new FileOutputStream(file path)
     *      4. ObjectOutputStream out = new ObjectOutputStream(fileOut)
     *      5. out.writeObject(objectName)
     *      6. out.close(); fileOut.close();
     * 
     * Steps to Deserialize object
     *      1. Declare your object
     *      2. Your class should implement the Serializable interface
     *      3. Add import java.io.Serializable
     *      4. FileInputStream fileIn = new FileInputStream(file path)
     *      5. ObjectInputStream in = new ObjectInputStream(fileIn)
     *      6. objectName = (Class) in.readObject();
     *      7. in.close(); fileIn.close();
     * 
     * Important notes:
     *      1. Children classes of parent classes that implements the Serializable will do so as well.
     *      2. Static fields are not serialized
     *      3. Serialization saves the object's values, not the class
     *      4. The class's definition (class file) is not recorded, class casting is needed during
     *         initialization
     *      5. Fields declared as "transient" are not serialized, they're ignored
     *      6. serialVersionUID is a unique version ID that is serializable
     */

    public static void main (String [] args) throws IOException{
        Lesson77_User user = new Lesson77_User();

        user.name = "Allan";
        user.password = "WAKSTER2112";
        user.sayHello();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object Info Saved.");
    }
}
