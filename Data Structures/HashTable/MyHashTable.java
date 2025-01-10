import java.util.*;

public class MyHashTable{
    public static void main (String [] args){

        /*
         * Hashtable:   Data structure that stores a unique key to values e.g.<Integer, String>
         *              Each key-value pair is considered as an entry
         *              FAST INSERTION, and FAST look-up, and FAST insertion and deletion
         *              Not ideal for small data sets, but works well with huge data sets
         * 
         * Hashing:     Takes a key and computes an integer (Formula will vary from their data-types)
         *              In a hashtable, we use the key's hash code % capacity size, to calculate the index number
         * 
         *              Index number: key.hashCode() % capacity size
         * 
         * Bucket:      Indexed storage location for one or more entries
         *              Can store multiple entries in case of collision (e.g. Linked list of entries with the same index)
         * 
         * Collision:   Hash function generates the same index number.
         *              The less the collisions, the more efficient the hash table is.
         * 
         * Runtime:     Best Case   O(1)
         *              Worst Case  O(n)
         */

        Hashtable<Integer, String> table = new Hashtable<>(10, 0.5f); //Capacity & load factor

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(555, "Squidward");
        table.put(321, "Sandy");
        table.put(777, "Gary");

        table.remove(777);

        // System.out.println(table.get(100));

        for (Integer key : table.keySet())
            System.out.println((key.hashCode() % table.size()) + "\t" + key + "\t" + table.get(key)); //Prints out the last element added first. (LIFO)
        
        Hashtable<String, String> table2 = new Hashtable<>(10, 0.5f); //Capacity & load factor

        table2.put("100", "Spongebob");
        table2.put("123", "Patrick");
        table2.put("321", "Sandy");
        table2.put("555", "Squidward");
        table2.put("777", "Gary");

        //table2.remove("777");

        System.out.println();
        for (String key : table2.keySet())
            System.out.println(key.hashCode() % table2.size() + "\t" + key + "\t" + table2.get(key));

        //Note: Different data types have different hash-code formulas.
    }
}