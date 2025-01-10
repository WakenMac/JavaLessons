public class Queue_2Stack<T>{
    public Stack_Modified<T> baseStack, queueStack;

    public Queue_2Stack(){
        baseStack = new Stack_Modified<>();
        queueStack = new Stack_Modified<>();
    }

    public void enqueue(T data){
        System.out.println("\n\nPushing node...");
        baseStack.push(data);
        reverseStack(baseStack, queueStack);
        queueStack.printStack();
    }

    public T dequeue(){
        T tempData = queueStack.pop();
        reverseStack(queueStack, baseStack);
        return tempData;
    }

    public void reverseStack(Stack_Modified<T> refStack, Stack_Modified<T> reverseStack){
        Stack_Modified<T> tempStack = new Stack_Modified<>();
        reverseStack.resetStack();

        System.out.println("\n\nReversing Stack...");
        //Gets the data from the original stack and passes it to the tempStack and 
        //Generates a reversed version of the stack, First In, First Out format.
        //  Essentially, turning it into a queue
        while(!refStack.isEmpty()){
            T data = refStack.pop();
            tempStack.push(data);
            reverseStack.push(data);
        }

        //Generates the original stack used
        while(!tempStack.isEmpty()){
            refStack.push(tempStack.pop());
        }
    }

    public void print(){
        System.out.println("Entered Printing.\n\n");
        while(!queueStack.isEmpty()){
            if (queueStack.isEmpty()){
                System.out.println("Queue stack is empty");
            }
            System.out.println(queueStack.pop());
        }
    }

    public static void main (String [] args){
        Queue_2Stack<Integer> queue= new Queue_2Stack<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println("Task Finished");
        queue.print();
    }
}