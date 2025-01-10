public class Lesson77_User implements java.io.Serializable{
    public String name;
    public transient String password;
    public static final long serialVersionUID = 1;
    public int [] array = {1, 2, 3, 4, 5};

    public void sayHello(){
        System.out.println("Hello " + name + "!");
    }
}
