/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Binary Search Tree
 * November 22, 2024
 */

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(){ this(null); }
    public BinarySearchTree(Node root){ this.root = root; }

    public void changeRootNode(Node rootNode){ this.root = rootNode; }

    public boolean add(int value){
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return true;
        }   else
                return addNode(node, root);
    }

    public boolean addNode(Node node, Node currentRoot){
        if (node == null)
            return false;

        //Adds a new node as a left child
        if (node.getValue() >= currentRoot.getValue()){
            if (currentRoot.getRight() != null)
                addNode(node, currentRoot.getRight());
            else {
                currentRoot.setRight(node);
                return true;
            }
        }   
        
        //Adds a new node as a right child
        else if (node.getValue() < currentRoot.getValue()){
            if (currentRoot.getLeft() != null)
                addNode(node, currentRoot.getLeft());
            else {
                currentRoot.setLeft(node);
                return true;
            }
        }   
    
        return true;        
    }

//=======================================================================================================================================
//Searching

    //Searches for the node within the binary tree based on its value (Greater than or Less than)
    //Returns the depth on where the node is located
    public int search(int value){ 
        if (root == null){
            System.out.println("Null Binary Tree found. Unable to search");
            return -1;
        }

        Node temp = this.root;
        int depth = 1;

        while (temp != null){
            if (value < temp.getValue())
                temp = temp.getLeft();
            else if (value > temp.getValue())
                temp = temp.getRight();
            else if (value == temp.getValue())
                return depth;
            
            depth++;
        }

        return -1;
    }

//=======================================================================================================================================
//Removing 

    public Node remove(int value){ return remove(this.root, null, value); }
    private Node remove(Node current, Node parent, int value){
        if (current == null)
            return current;

        //Traverses the Binary Search Tree
        if (value > current.getValue())
            return remove(current.getRight(), current, value);

        else if (value < current.getValue())
            return remove(current.getLeft(), current, value);

        //The node was found
        else {
            Node deletedNode = new Node(current);
            
            //Node to be deleted is a leaf node
            if (current.getLeft() == null && current.getRight() == null){
                if (parent == null)
                    root = null;

                //Finds out of the current is the parent's left or right child
                else if (parent.getLeft().getValue() == current.getValue()) 
                    parent.setLeft(null);
                else 
                    parent.setRight(null);
            }   

            //Node to be deleted has a child at the right side
            else if (current.getLeft() == null){
                if (parent == null)
                    root = current.getRight();
                
                else if (parent.getLeft().getValue() == current.getValue())
                    parent.setLeft(current.getRight());
                else
                    parent.setRight(current.getRight());
            }

            //Node to be deleted has a child at the left side
            else if (current.getRight() == null){
                if (parent == null)
                    root = current.getLeft();
                
                else if (parent.getLeft().getValue() == current.getValue())
                    parent.setLeft(current.getLeft());
                else
                    parent.setRight(current.getLeft());
            }

            //Node to be deleted has two children
            else {
                Node successor = getSuccessor(current.getRight());
                int successorValue = successor.getValue();
                remove(current.getRight(), current, successorValue);
                current.setValue(successorValue);
            }

            return deletedNode;
        }
    }

//=======================================================================================================================================
//Finds the min and max values
    //Traverse in a left-skewed manner
    @SuppressWarnings("empty-statement")
    public int getMin(){
        if(root == null)
            return 0;

        Node temp = root;
        for (; temp.getLeft() != null; temp = temp.getLeft());
        return temp.getValue();
    }

    //Traverse in a right-skewed manner
    @SuppressWarnings("empty-statement")
    public int getMax(){
        if(root == null)
            return 0;

        Node temp = root;
        for (; temp.getRight() != null; temp = temp.getRight());
        return temp.getValue();
    }

    public int getDepth(){ return getDepth(this.root); }
    private int getDepth(Node currentRoot){
        if (currentRoot == null)
            return 0;

        int left = getDepth(currentRoot.getLeft());
        int right = getDepth(currentRoot.getRight());
        return max(left, right) + 1;
    }
//========================================================================================================================================
//Printing the Binary Tree
    public void preOrder(){ preOrder(root); }    
    private void preOrder(Node root){
        if (root == null)
            return;

        System.out.print(root.getValue() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(){ inOrder(this.root); }

    private void inOrder(Node root){
        if (root == null)
            return;
        
        inOrder(root.getLeft());
        System.out.print(root.getValue() + " ");
        inOrder(root.getRight());
    }

    public void postOrder(){ postOrder(this.root); }
    private void postOrder(Node root){
        if (root == null)
            return;

        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }

//========================================================================================================================================
//Helper Methods

    public void lineBreak(){ System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }

    private int max(int int1, int int2){ return (int1 > int2)? int1 : int2; }

    private Node getSuccessor(Node node) {
        while(node.getLeft() != null)
            node = node.getLeft();
        return node;
    }  
}
