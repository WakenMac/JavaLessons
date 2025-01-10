public class Node<T>{
    Node <T> next;
    T data;

    public Node(T data){
        this.data = data;
    }

    public void removeNext(){
        this.next = null;
    }

    public T getData(){
        return this.data;
    }
}