public class Stack_Modified<T> {

    private Node<T> headNode;

    public Stack_Modified(){
        this.headNode = null;
    }

    public void resetStack(){
        this.headNode = null;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = headNode;
        headNode = newNode;
    }

    public T pop(){
        if (isEmpty())
           return null;

        T tempData = headNode.getData();
        headNode = headNode.next;
        return tempData;
    }

    public Node<T> peek(){
        if (isEmpty())
            return null;
        return headNode;
    }

    public boolean isEmpty(){
        return headNode == null;
    }

    public int getLength(){
        Node<T> tempNode = headNode;
        int counter = 0;

        if (headNode == null)
            return 0;

        while(tempNode.next != null){
            counter++;
            tempNode = tempNode.next;
        }

        return counter;
    }

    public void printStack(){
        Node<T> tempNode = headNode;

        System.out.println("Stack: ");
        while(tempNode != null){
            System.out.println(tempNode.getData());
            tempNode = tempNode.next;
        }
    }

    public static void main (String [] args){
        Stack_Modified<Integer> stack = new Stack_Modified<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();
    }

}