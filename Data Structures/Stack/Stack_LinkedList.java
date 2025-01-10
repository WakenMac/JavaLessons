import java.util.Scanner;

public class Stack_LinkedList {
    /*
     * Stack:
     *      LIFO structure (Last In - First Out)
     *      push (data) : adds item to the top of the stack
     *      pop()       : removes the top / last item of the stack
     *      peek()      : checks the item that is on the top of the stack
     *      isEmpty()   : checks if the stack is empty
     * 
     * Using a Linked List, we intentionally set the top of the stack to be the head node, with
     *      the succeeding nodes being the objects at the bottom of the stack
     * 
     * Do note that this is made manually, the java class made here is more advanced hehe
     */

    public Node headNode = null;
    public Node tempNode; //Node to connect to the tempNode
    public Scanner word = new Scanner(System.in);
    public String gameName;

    private class Node{
        public String data;
        public Node nextNode;

        public Node(String data){
            this.data = data;
        }

        @Override
        public String toString(){
            return this.data;
        }
    }

    public void push(Node referenceNode){
        if (isEmpty())
            headNode = referenceNode;
        else
            referenceNode.nextNode = headNode;
            headNode = referenceNode;
    }

    public Node pop(){
        if (isEmpty()){
            System.out.println("IUnderflow!");
        }

        Node temp = headNode;
        headNode = headNode.nextNode;
        return temp;
    }

    public Node peek(){
        if (!isEmpty())
            return headNode;

        else{
            System.out.println("Underflow!");
            return null;
        }
    }

    public boolean isEmpty(){
        if (headNode == null)
            return true;
        else
            return false;
    }

    public String toString(){
        Node referenceNode = headNode;
        String referenceString = "List of games: \n";
        int counter = 1;

        referenceString += "[" + (counter++) + "] " +  referenceNode;
        while (referenceNode.nextNode != null){
            referenceString += "\n[" + (counter++) + "] " +  referenceNode;
            referenceNode = referenceNode.nextNode;
        }

        return referenceString;
    }

    public Stack_LinkedList(){
        String choice;
        String options = 
        """
        STACK!
        [1] PUSH  : Add a game to the stack
        [2] POP   : Remove a game from the stack
        [3] PEEK  : Check the game that is at the top of the stack
        [4] PRINT : Print the contents of the stack in order
        [5] QUIT  : Ends the program

        Option: """;

        while(true){
            System.out.print(options);
            choice = Character.toString(word.nextLine().charAt(0));

            if (choice.equals("1")){
                enterGameName();
                System.out.println("Added " + headNode + " to your stack.\n\n");
            }

            else if (choice.equals("2")){
                System.out.println("Removed " + pop() + " from your stack.\n\n");
            }

            else if (choice.equals("3")){
                System.out.println("The game: " + peek() + " is at the top of your stack.\n\n");
            }

            else if (choice.equals("4")){
                System.out.println(this.toString() + "\n\n");
            }

            else if (choice.equals("5")){
                System.exit(0);
            }

            else{
                System.out.println("The option " + choice + "is not part of the following options. \n\n");
                continue;
            }
        }
    }

    public void enterGameName(){
        System.out.print("\nEnter the name of your game: ");
        gameName = word.nextLine();

        if (gameName.isEmpty()){
            enterGameName();
            return;
        }

        tempNode = new Node(gameName);
        push(tempNode);
        System.out.println("\n\n");
    }


    public static void main (String [] args){
        new Stack_LinkedList();
    }
}
