public class Node {
    public Node left;
    public Node right;
    private int data;

//Constructors
    public Node(int data){ 
        this.data = data;
        left = right = null; 
    }
    
//Getters and Setters
    public void setData(int data){ this.data = data; }
    public int getData(){ return this.data; }

    @Override
    public String toString(){
        return Integer.toString(data);
    }
}
