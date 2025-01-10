/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Binary Search Tree
 * November 22, 2024
 */

public class Maclang_Main {
    public static void main(String [] args){
        AVL avl = new AVL();

        avl.add(1);
        avl.add(2);
        avl.add(3);
        avl.add(4);

        String option = "[I]nsert   [S]earch    [R]emove    E[X]it";
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.util.Scanner numInput = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("AVL Interface. \n\nPre-Order: ");
            avl.preOrder();
            System.out.print("\nIn-Order: ");
            avl.inOrder();
            System.out.print("\nPost-Order: ");
            avl.postOrder();

            System.out.println("\n\nMin: " + avl.getMin());
            System.out.println("Max: " + avl.getMax());
            System.out.println("Height: " + avl.getDepth() + "\n");

            System.out.print("\n" + option + "\nChoice: ");
            char choice = input.nextLine().charAt(0);

            switch (choice) {
                case 'I' -> { //Insert
                    System.out.print("Enter a value to be added: ");
                    int value = numInput.nextInt();
                    boolean isAdded = avl.add(value);
                    
                    if (isAdded)
                        System.out.println("Added node successfully.");
                    else
                        System.out.println("Program was unable to add node.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    avl.lineBreak();
                }

                case 'S' -> { //Search
                    System.out.print("Enter a value to be searched: ");
                    int value = numInput.nextInt();
                    int depth = avl.search(value);
                    
                    if (depth > -1)
                        System.out.println("Found the node with value " + value + " at depth " + depth);
                    else 
                        System.out.println("Value not found within the binary tree.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    avl.lineBreak();
                }
                    
                case 'R'-> {
                    System.out.print("Enter which value will be removed: ");
                    int value = numInput.nextInt();
                    // Node removedNode = avl.remove(value);
                    boolean isRemoved = avl.remove(value);

                    if (isRemoved)
                        System.out.println("Successfully removed the value " + value + " from the binary tree.");
                    else
                        System.out.println("Unable to remove the value " + value + " from the binary tree.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    avl.lineBreak();
                }
                    
                case 'X' -> {
                    input.close();
                    numInput.close();

                    System.out.println("Leaving the program.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}

                    System.exit(0);
                }
                
                default -> { 
                    System.out.println("Invalid input. Please try again."); 
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    avl.lineBreak();
                }
                    
            } //End of switch loop
        }//End of while loop
    }//End of main method
}
