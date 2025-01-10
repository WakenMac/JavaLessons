/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Assignment #8 (Hash Tables)
 * November 27, 2024
 */

 //Singly linked list implementation of a key node
public class KeyNode{
    private int value;
    private KeyNode next;

    public KeyNode(KeyNode node){ this(node.getValue()); } //Copy Constructor

    //Main Constructor
    public KeyNode(int value){
        this.value = value;
        this.next = null;
    }

    public void setValue(int value){ this.value = value; }
    public int getValue(){ return this.value; }

    public void setNext(KeyNode next){ this.next = next; }
    public KeyNode getNext(){ return this.next; }
}