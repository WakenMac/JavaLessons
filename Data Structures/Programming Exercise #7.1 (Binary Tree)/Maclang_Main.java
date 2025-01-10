/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Binary Search Tree
 * November 22, 2024
 */

public class Maclang_Main {
    public static void main(String [] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(2);
        bst.add(3);
        bst.add(1);
        bst.add(4);

        String option = "[I]nsert   [S]earch    [R]emove    E[X]it";
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.util.Scanner numInput = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("BST Interface. \n\nPre-Order: ");
            bst.preOrder();
            System.out.print("\nIn-Order: ");
            bst.inOrder();
            System.out.print("\nPost-Order: ");
            bst.postOrder();

            System.out.println("\n\nMin: " + bst.getMin());
            System.out.println("Max: " + bst.getMax());
            System.out.println("Height: " + bst.getDepth() + "\n");

            System.out.print("\n" + option + "\nChoice: ");
            char choice = input.nextLine().charAt(0);

            switch (choice) {
                case 'I' -> { //Insert
                    System.out.print("Enter a value to be added: ");
                    int value = numInput.nextInt();
                    boolean isAdded = bst.add(value);
                    
                    if (isAdded)
                        System.out.println("Added node successfully.");
                    else
                        System.out.println("Program was unable to add node.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    bst.lineBreak();
                }

                case 'S' -> { //Search
                    System.out.print("Enter a value to be searched: ");
                    int value = numInput.nextInt();
                    int depth = bst.search(value);
                    
                    if (depth > -1)
                        System.out.println("Found the node with value " + value + " at depth " + depth);
                    else 
                        System.out.println("Value not found within the binary tree.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    bst.lineBreak();
                }
                    
                case 'R'-> {
                    System.out.print("Enter which value will be removed: ");
                    int value = numInput.nextInt();
                    Node removedNode = bst.remove(value);

                    if (removedNode != null)
                        System.out.println("Successfully removed the value " + removedNode.getValue() + " from the binary tree.");
                    else
                        System.out.println("Unable to remove the value " + value + " from the binary tree.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    bst.lineBreak();
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
                    bst.lineBreak();
                }
                    
            }
        }
    }
}
