/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Assignment #8 (Hash Tables)
 * November 27, 2024
 */

public class Maclang_Main {
    
    public static void main(String [] args){
        HashTable chainingTable = new HashTable(HashTable.CHAINING, 10);
        HashTable linearTable = new HashTable(HashTable.LINEAR_PROBING, 10);
        HashTable quadTable = new HashTable(HashTable.QUADRATIC_PROBING, 10);

        System.out.println("Chaining Hash Table: ");
        sleep(2000);

        //Test Case 1: Chaining Hash Table
        //Test Case 1.1: Adding
        chainingTable.add(1);
        chainingTable.add(2);
        chainingTable.add(3);
        chainingTable.add(4);
        chainingTable.add(5);
        chainingTable.add(11);
        chainingTable.add(12);
        chainingTable.add(22);
        chainingTable.add(15);
        chainingTable.add(9);

        //Test Case 1.2: Searching
        System.out.println("Found value: " + chainingTable.search(11).getValue());
        System.out.println("Found value: " + chainingTable.search(5).getValue());
        System.out.println("Found value: " + chainingTable.search(22).getValue());
        System.out.println("Found value: " + chainingTable.search(8).getValue()); //-1 KeyNode value means that the searched 
                                                                                        //for value is not part of the Hash Table
        sleep(2000);

        //Test Case 1.3: Removing
        System.out.println("\nRemoved value: " + chainingTable.remove(22).getValue());
        sleep(2000);

        addGap();
        System.out.println("Linear Probing Hash Table.");
        sleep(2000);

        //Test Case 2: Linear Probing Hash Table
        //Test Case 2.1: Adding
        linearTable.add(1);
        linearTable.add(2);
        linearTable.add(3);
        linearTable.add(4);
        linearTable.add(8);
        linearTable.add(11);
        linearTable.add(6);
        linearTable.add(7);
        linearTable.add(9);
        linearTable.add(10);
        linearTable.add(13);

        //Test Case 2.2: Searching
        System.out.println("Found value: " + linearTable.search(11).getValue());

        //Test Case 2.3: Removing
        System.out.println("\nRemoved value: " + linearTable.remove(3).getValue());     //Removes an inner element first
        System.out.println("\nRemoved value: " + linearTable.remove(11).getValue());    //Removes the second to the last element

        //Test Case 3: Quadratic Probing Hash Table
        //Test Case 3.1: Adding
        quadTable.add(1);
        quadTable.add(2);
        quadTable.add(3);
        quadTable.add(4);
        quadTable.add(8);
        quadTable.add(11);

        //Test Case 3.2: Searching
        System.out.println("Found value: " + quadTable.search(11).getValue());

        //Test Case 3.3: Removing
        System.out.println("\nRemoved value: " + quadTable.remove(3).getValue());     //Removes an inner element first
        System.out.println("\nRemoved value: " + quadTable.remove(11).getValue());    //Removes the second to the last element
    }

    private static void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {}
    }

    private static void addGap(){ System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }

}
