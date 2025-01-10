public class MyBinaryNode <T> {
    private MyBinaryNode<T> left;
    private MyBinaryNode<T> right;
    private T data;

    public MyBinaryNode(T data, MyBinaryNode<T> right, MyBinaryNode<T> left){
        this.data = data;
        this.right = right;
        this.left = left;
    }

//Constructors
    public MyBinaryNode(){ this(null, null, null); }
    public MyBinaryNode(T data){ this(data, null, null); }
    public MyBinaryNode(MyBinaryNode<T> node){ this(node.getData(), node.getLeft(), node.getRight()); }
    
//Getters and Setters
    public void setLeft(MyBinaryNode<T> node){ this.left = new MyBinaryNode<T>(node); }
    public MyBinaryNode<T> getLeft(){ return this.left; }

    public void setRight(MyBinaryNode<T> node){ this.right = new MyBinaryNode<T>(node); }
    public MyBinaryNode<T> getRight (){ return this.right; }

    public void setData(T data){ this.data = data; }
    public T getData(){ return this.data; }

    @Override
    public String toString(){
        return data.toString();
    }
}
