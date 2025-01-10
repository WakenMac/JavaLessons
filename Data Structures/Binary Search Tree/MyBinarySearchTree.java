public class MyBinarySearchTree {
    
    private Node root;
    private int size;
    
    public static void main(String [] args){
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(20);

        System.out.println("Left: " + bst.root.left + "\n\n");
        bst.inOrder();
    }

    public MyBinarySearchTree(){
        root = null;
        size = 0;
    }

    public void add(int value){ 
        root = addRecursive(value, root); 
    }

    private Node addRecursive(int value, Node currentNode){
        if (currentNode == null){
            size++;
            return new Node(value);
        }
        
        if (value < currentNode.getData())
            currentNode.left = addRecursive(value, currentNode.left);
        else if (value > currentNode.getData())
            currentNode.right = addRecursive(value, currentNode.right);
        
        return currentNode;
    }

    public void inOrder(){ inOrder(this.root); }
    private void inOrder(Node rootNode){
        if (rootNode == null)
            return;
        
        inOrder(rootNode.left);
        System.out.println(rootNode.getData());
        inOrder(rootNode.right);
    }
}
