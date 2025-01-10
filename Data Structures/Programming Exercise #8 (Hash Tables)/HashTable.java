/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Assignment #8 (Hash Tables)
 * November 27, 2024
 */

/*
 * Hash Table that can work  different types of hashing functions
 * Each hash table can only have one type and is immutable after instantiation.
 * 
 * During instantiation of a hash table, one may decide to use either a Chaining, Linear Probing, or Quadratic Probing hash table, and
 *      the format on which hash table type is used cannot be changed after instantiation.
 * 
 * This implementation supports same valued keys
 */
public class HashTable {
    private KeyNode [] array;

    public static final int CHAINING = 1;
    public static final int LINEAR_PROBING = 2;
    public static final int QUADRATIC_PROBING = 3;

    private static final int ADDING = 1;
    private static final int REMOVING = 2;

    final int HASH_TABLE_TYPE;
    private final int SIZE;     //Final size of the hash table
    private int elementSize;    //Number of elements present in the hash table

    public HashTable(){ this(CHAINING, 10); }
    public HashTable(int value){ this(value, 10); }
    public HashTable(int value, int size){
        HASH_TABLE_TYPE = value;
        SIZE = size;
        array = new KeyNode[SIZE];

    }

    public boolean add(int value){
        if (value < 0){
            System.out.println("The program doesn't accept negative values.");
            sleep(2000);
            return false;
        }

        boolean isAdded = add(new KeyNode(value));

        if (!isAdded)
            System.out.println("Unable to add new KeyNode with value: " + value + " due to possible hash table overflow.");
        
        printHashTable(ADDING);
        System.out.println();
        sleep(1000);

        return isAdded;
    }

    @SuppressWarnings("empty-statement")
    private boolean add(KeyNode node){
        if (HASH_TABLE_TYPE == CHAINING){
            //Calls the hash function to find the associated index for the new KeyNode
            int probeValue = hash(node.getValue()); 

            //Checks if the linked list is null or not
            if (array[probeValue] == null)
                array[probeValue] = node;
            else {
                KeyNode otherNode;
                for (otherNode = array[probeValue]; otherNode.getNext() != null; otherNode = otherNode.getNext()); //Traverses the link list
                otherNode.setNext(node);
            }

            elementSize++;
            return true;
        }

        else {
            int probeValue = hash(node.getValue());
            if (probeValue == -1)
                return false;
            
            array[probeValue] = node;
            elementSize++;
            return true;
        }
    }

    public KeyNode search(int value){
        if (value == -1){
            System.out.println("The program doesn't accept negative values.");
            sleep(2000);
            return new KeyNode(value);
        }

        //Doens't use the hash function as it works for finding empty indexes for Closed Hash Tables
        int hashValue = value % SIZE;

        if (hashValue == - 1)
            return new KeyNode(-1);

        else if (HASH_TABLE_TYPE == CHAINING){
            for (KeyNode node = array[hashValue]; node != null; node = node.getNext()){
                if (node.getValue() == value)
                    return node;
            }

            return new KeyNode(-1);
        }

        else {
            int i = 0;
            
            //Changes the probeValue then searches if the element's value is the same to the @param value
            while (true) { 
                int hashIndexSum = SIZE;

                if (HASH_TABLE_TYPE == LINEAR_PROBING)
                    hashIndexSum = hashValue + i;
                else if (HASH_TABLE_TYPE == QUADRATIC_PROBING)
                    hashIndexSum = hashValue + (i * i);

                int probeValue = hashIndexSum % SIZE;

                if (hashIndexSum >= SIZE)
                    return new KeyNode(-1);
                else if (array[probeValue].getValue() == value)
                    return array[probeValue];
                else
                    i++;
            }
        }
    }

    public int findIndex(int value){
        if (value == -1){
            System.out.println("The program doesn't accept negative values.");
            sleep(2000);
            return -1;
        }

        //Doens't use the hash function as it works for finding empty indexes for Closed Hash Tables
        int hashValue = value % SIZE;

        if (hashValue == - 1)
            return -1;

        else if (HASH_TABLE_TYPE == CHAINING){
            int counter = 0;
            for (KeyNode node = array[hashValue]; node != null; node = node.getNext()){
                if (node.getValue() == value)
                    return counter;
                counter++;
            }

            return -1; //Value not found
        }

        else {
            int i = 0;
            
            //Changes the probeValue then searches if the element's value is the same to the @param value
            while (true) { 
                int hashIndexSum = SIZE;

                if (HASH_TABLE_TYPE == LINEAR_PROBING)
                    hashIndexSum = hashValue + i;
                else if (HASH_TABLE_TYPE == QUADRATIC_PROBING)
                    hashIndexSum = hashValue + (i * i);

                int probeValue = hashIndexSum % SIZE;

                if (hashIndexSum >= SIZE)
                    return -1;
                else if (array[probeValue] == null || array[probeValue].getValue() != value)
                    i++;
                else
                    return probeValue;
            }
        }
    }

    @SuppressWarnings("empty-statement")
    public KeyNode remove(int value){
        int index = findIndex(value);

        if (index == -1)
            return new KeyNode(index);

        KeyNode node = new KeyNode(array[index]);

        if (HASH_TABLE_TYPE == CHAINING){
            if (array[index].getValue() == value)
                array[index] = array[index].getNext();

            else {
                KeyNode otherNode;
                for (otherNode = array[index]; otherNode.getNext().getValue() != value; otherNode = otherNode.getNext());
                otherNode.setNext(otherNode.getNext().getNext());
            }
        }

        else {
            array[index] = null;
        }

        printHashTable(REMOVING);
        sleep(1000);
        return node;
    }

    //Does the hashing function to find the index of the value in the hash table
    public int hash(int value){
        //Finds the index using a hashing function (Chaining)
        if (HASH_TABLE_TYPE == CHAINING)
            return value % SIZE;

        //Finds the index using the hashing function of either Linear Sorting or Quadratic Probing
        else {
            int tempHashValue = value % SIZE;
            int i = 0, probeValue;

            while (true) { 
                int hashIndexSum = SIZE;

                if (HASH_TABLE_TYPE == LINEAR_PROBING)
                    hashIndexSum = tempHashValue + i;
                else if (HASH_TABLE_TYPE == QUADRATIC_PROBING)
                    hashIndexSum = tempHashValue + (i * i);

                probeValue = hashIndexSum % SIZE;

                if (hashIndexSum >= SIZE)
                    return -1;
                else if (array[probeValue] != null)
                    i++;
                else
                    return probeValue; //Found an empty array cell
            }
        }
    }

    public void printHashTable(int scenario){

        if (scenario == ADDING)
            System.out.println("\nHash Table After Adding: ");
        else if (scenario == REMOVING)
            System.out.println("\nHash Table After Removing: ");

        if (HASH_TABLE_TYPE == CHAINING){
            for (int i = 0; i < SIZE; i++){

                //Traverses the linked list array
                if (array[i] != null){
                    System.out.print("[" + i + "]: ");
                    for (KeyNode node = array[i]; node != null; node = node.getNext()){
                        System.out.print(node.getValue());

                        if (node.getNext() != null)
                            System.out.print(" -> ");
                    }

                    System.out.println();
                }
            }
        }

        //Prints the contents of the Closed Hash Table
        else {
            for (int i = 0; i < SIZE; i++){
                if (array[i] != null)
                    System.out.println("[" + i + "]: " + array[i].getValue());
            }
        }
    }

    private void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {}
    }
    
}
