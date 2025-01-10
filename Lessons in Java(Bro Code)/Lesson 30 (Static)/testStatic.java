public class testStatic {
    static GameInterface gf = new GameInterface ();
    public static void main (String [] args){
        for(int i = 3; i != 0; i--){
            GameInterface.setPrintSpeed();
            GameInterface.typewritter("\n\n" + GameInterface.printSpeed+ "\n\n");
        }
    }
}
