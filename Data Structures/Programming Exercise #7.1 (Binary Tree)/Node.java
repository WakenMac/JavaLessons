/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Binary Search Tree
 * November 22, 2024
 */

public class Node {
    private int value;

    private Node leftNode, rightNode;

    //Blank constructor
    public Node(){ this(null, null, 0); }

    //Makes a node with its character reference and frequency
    public Node(int value){ this(null, null, value); }

    //Sets a new instance of the old node without both of its childs
    public Node(Node otherNode){ this(null, null, otherNode.getValue()); }
    
    //Main constructor
    public Node(Node leftNode, Node rightNode, int value){
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.value = value;
    }

    public void setValue(int value){ this.value = value; }
    public int getValue(){ return this.value; }

    public void setLeft(Node otherNode){ this.leftNode = otherNode; }
    public Node getLeft(){ return this.leftNode; }

    public void setRight(Node otherNode){ this.rightNode = otherNode; }
    public Node getRight(){ return this.rightNode; }
}
