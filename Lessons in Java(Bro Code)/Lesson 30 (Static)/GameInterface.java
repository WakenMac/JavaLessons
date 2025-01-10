import java.util.Scanner;

public class GameInterface {

    static Scanner word = new Scanner (System.in);
    static int printSpeed;
    static String userInput;

    static String speedList = 
        """
        ==============================================
        *Print Speed only affects the character   
            dialogues*
        
        [1] Slow
        [2] Normal
        [3] Fast
        ==============================================
        Choice:""";

    static void setPrintSpeed(){
        typewritter(speedList, 3);
        userInput = word.nextLine();

        if (userInput.equals("1")){
            printSpeed = 60;
            typewritter("\nSpeed set to SLOW");
        }   else if (userInput.equals("2")){
                printSpeed = 45;
                typewritter("\nSpeed set to NORMAL");
            }   else if (userInput.equals("3")){
                    printSpeed = 30;
                    typewritter("\nSpeed set to FAST");
                }
    }

    static void typewritter(String refString){
        try{
            for (int i  = 0; i < refString.length(); i++){
                System.out.print(refString.charAt(i));
                Thread.sleep(printSpeed);
            }
        } catch (InterruptedException e){
                e.printStackTrace();
            }
    }

    static void typewritter(String refString, int textSpeed){
        try{
            for (int i  = 0; i < refString.length(); i++){
                System.out.print(refString.charAt(i));
                Thread.sleep(textSpeed);
            }
        } catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}
