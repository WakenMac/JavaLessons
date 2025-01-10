public class BTNode {
    private int value;
    public BTNode left, right;

    public BTNode(int value){
        this.value = value;
        left = right = null;
    }

    public int getValue(){
        return this.value;
    }
}
