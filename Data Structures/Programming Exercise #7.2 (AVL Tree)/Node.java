/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Binary Search Tree
 * November 22, 2024
 */

public class Node {
    private int value, height;

    private Node leftNode, rightNode;

    //Blank constructor
    public Node(){ this(null, null, 0, 1); }

    //Makes a node with its character reference and frequency
    public Node(int value){ this(null, null, value, 1); }

    //Sets a new instance of the old node without both of its childs
    public Node(Node otherNode){ this(null, null, otherNode.getValue(), otherNode.getHeight()); }
    
    //Main constructor
    public Node(Node leftNode, Node rightNode, int value, int height){
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.value = value;
        this.height = height;
    }

    public void setValue(int value){ this.value = value; }
    public int getValue(){ return this.value; }

    public void setHeight(int height){ this.height = height; }
    public int getHeight(){ return this.height; }

    public void setLeft(Node otherNode){ this.leftNode = otherNode; }
    public Node getLeft(){ return this.leftNode; }

    public void setRight(Node otherNode){ this.rightNode = otherNode; }
    public Node getRight(){ return this.rightNode; }

    /*Increments the value of the height of a node */
    public void increment(){ this.height++; }

    /*Decrements the value of the height of a node */
    public void decrement(){ this.height--; }
}
