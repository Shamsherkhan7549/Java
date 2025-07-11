
class Queue<T>{
    int length = 5;
    int size = 0;
    int front = 0;
    int rear = 0;
    Object arr[] = new Object[length];

    void push(T element){
        if(rear == length && size < length){
            rear = 0;
            arr[rear] = element;
            rear++;
            size++;
        }else{
            arr[rear] = element;
            rear++;
            size++;
        }
    }

    T remove(){
        T f =  (T) arr[front];
        arr[front] = 0;
        front++;
        size--;
        return f;
    }

    T peek(){
        return (T) arr[front];
    }

    boolean isEmpty(){
        if(size > 0) return false;
        return true;
    }

    void print(){
        for(int i = front; i < rear; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}

public class CircularQueueUsingArray {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.push(4);
        queue.push(5);
        queue.push(8);
        queue.push(9);
        queue.push(2);
        queue.print();
        System.out.println("peeked element: " + queue.peek());
        System.out.println("removed element: " + queue.remove());
        queue.remove();       
        queue.remove();
        System.out.println( "rear " + queue.rear);

        // queue.push(5);       
        queue.print();
        System.out.println("peeked element: " + queue.peek());



    }
}
