/**
 * @author Waken Cean C. Maclang
 * BSCS 2A
 * Data Structures: Binary Search Tree
 * November 22, 2024
 */

public class AVL {
    private Node root;
    private int size;

    public AVL(){ this(null); }
    public AVL(Node root){ this.root = root; }

    public int getSize(){ return this.size; }

    public void changeRootNode(Node rootNode){ this.root = rootNode; }

//=======================================================================================================================================
//Adding

    public boolean add(int value){
        int initialSize = this.size;
        root = add(root, new Node(value));
        return initialSize < this.size;
    }

    private Node add(Node currentRoot, Node newNode){
        if (currentRoot == null)
            return newNode;
        
        //Adds the new node as a right child of the currentRoot (Greater than currentRoot)
        if (newNode.getValue() > currentRoot.getValue())
            currentRoot.setRight(add(currentRoot.getRight(), newNode));
        
        //Adds the new node as a left child of the currentRoot (Less than currentRoot)
        else if (newNode.getValue() < currentRoot.getValue())
            currentRoot.setLeft(add(currentRoot.getLeft(), newNode));
        
        //If currentRoot is childless.
        else 
            return currentRoot;
        
        //Sets the height of the currentRoot based on the max height among both left and right sub-trees
        currentRoot.setHeight(max( getHeight(currentRoot.getLeft()), getHeight(currentRoot.getRight()) ) + 1);

        this.size++;
        return balance(currentRoot, newNode);
    }

//=======================================================================================================================================
//Searching
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

    public boolean remove(int value){ 
        int initialSize = this.size;
        this.root = remove(this.root, value);
        return initialSize > this.size;
    }
    
    private Node remove(Node currentNode, int value){
        if (currentNode == null){
            size--;
            return currentNode;
        }

        if (value > currentNode.getValue())
            currentNode.setRight(remove(currentNode.getRight(), value));

        else if (value < currentNode.getValue())
            currentNode.setLeft(remove(currentNode.getLeft(), value));

        else {
            // Node deletedNode = new Node(currentNode);
            
            //Node to be deleted is a leaf node
            if (currentNode.getLeft() == null)
                return currentNode.getRight();  

            //Node to be deleted has a child at the right
            else if (currentNode.getRight() == null)
                return currentNode.getLeft();

            //Node to be deleted has two children
            Node successor = getSuccessor(currentNode.getRight());
            currentNode.setValue(successor.getValue());
            currentNode.setRight(remove(currentNode.getRight(), successor.getValue()));
        }

        size--;
        currentNode.setHeight( max( getHeight(currentNode.getLeft()), getHeight(currentNode.getRight()) ) + 1);

        return balance(currentNode, new Node(value));
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
//Rotational Functions

    private Node balance(Node currentRoot, Node newNode){
        int balanceFactor = getBalance(currentRoot);

        if (balanceFactor > 1 || balanceFactor < -1){
            System.out.println("\nBalance Factor: " + balanceFactor + "\nBalancing now.");
            try { Thread.sleep(2000); } 
                catch (InterruptedException e) {}
        }

        //If the currentRoot's children is left-skewed
        if (balanceFactor > 1 && newNode.getValue() < currentRoot.getLeft().getValue())
            return rotateRight(currentRoot);

        //If the currentRoot's children are right-skewed
        else if (balanceFactor < -1 && newNode.getValue() > currentRoot.getRight().getValue())
            return rotateLeft(currentRoot);

        //If the currentRoot's children are left-right skewed
        else if (balanceFactor > 1 && newNode.getValue() > currentRoot.getLeft().getValue()){
            currentRoot.setLeft(rotateLeft(currentRoot.getLeft()));
            return rotateRight(currentRoot);
        }

        //If the currentRoot's children are right-left skewed
        else if (balanceFactor < -1 && newNode.getValue() < currentRoot.getRight().getValue()){
            currentRoot.setRight(rotateRight(currentRoot.getRight()));
            return rotateLeft(currentRoot);
        }

        //The entire binary tree / sub-tree is balanced
        return currentRoot;
    }

    /*
     * Method used to rotate right-skewed nodes.
     * 
     *  3           x       |        5      y (root)
     *   \                         /   \
     *    5         y       |     3     6   x (right child of root or y)
     *   / \                       \
     *  4   6       z       |       4       z (left child of x)
     */
    private Node rotateLeft(Node x){ 
        if (x == null || x.getRight() == null)
            return x;

        Node y = x.getRight(); // The right child of root (x)
        Node z = y.getLeft();  // The left child of (y)

        y.setLeft(x);   // Sets x as the left child of y 
        x.setRight(z);  // Sets z as the right child of x

        x.setHeight( max(getHeight(x.getLeft()), getHeight(x.getRight())) + 1);
        y.setHeight( max(getHeight(y.getLeft()), getHeight(y.getRight())) + 1);

        return y;
    }

    /*
     * Method used to rotate left-skewed nodes.
     * 
     *      5       y       |        3      x (root)
     *    3         x       |     ?     5   y (right child of root or x)
     *  ?   4       z       |         4     z (left child of y)
     */
    private Node rotateRight(Node y){
        if (y == null || y.getLeft() == null)
            return y;

        Node x = y.getLeft();   
        Node z = x.getRight();  

        x.setRight(y);
        y.setLeft(z);

        y.setHeight( max(getHeight(y.getLeft()), getHeight(y.getRight())) + 1);
        x.setHeight( max(getHeight(x.getLeft()), getHeight(x.getRight())) + 1);

        return x;
    }

    private int getHeight(Node node){
        return (node == null)? 0 : node.getHeight();
    }

    private int getBalance(Node node){
        return (node == null)? 0 : getHeight(node.getLeft()) - getHeight(node.getRight());
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
