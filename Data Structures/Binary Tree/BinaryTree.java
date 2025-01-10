public class BinaryTree {
    public BTNode root;

    public BinaryTree(){
        root = null;
    }

    public void add(int value){
        root = addRecursive(root, value);
    }

    public BTNode addRecursive(BTNode current, int value){
        if (current == null)
            return new BTNode(value);
        
        if (value < current.getValue())
            current.left = addRecursive(current.left, value);
        else if (value > current.getValue());   
            current.right = addRecursive(current.right, value);
        
        return current;
    }

    public void inorder(BTNode node){
        if (node == null)
            return;
        
        inorder(node.left);
        System.out.println(node.getValue());
        inorder(node.right);
    }

    public void preorder(BTNode node){
        if (node == null)
            return;
        
        System.out.println(node.getValue());
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(BTNode node){
        if (node == null)
            return;

        preorder(node.left);
        preorder(node.right);
        System.out.println(node.getValue());
    }

    public static void main(String [] args){
        BinaryTree tree = new BinaryTree();

        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);

        System.out.print("Preorder traversal: \n");
        tree.inorder(tree.root);
        System.out.println();
    }
}
