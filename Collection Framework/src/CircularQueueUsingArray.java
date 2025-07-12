
class Queue<T>{
    int length = 5;
    int size = 0;
    int front = 0;
    int rear = 0;
    Object arr[] = new Object[length];

    void push(T element){

        if(rear == length && size<length){
            arr[0] = element;
            rear = 1;
            size++;
        }else if(size<length){
            arr[rear] = element;
            rear++;
            size++;
        }else{
            System.out.println("Queue is full");
        }   
        
    }

    T remove(){
       if(front == length && size > 0){
            T f = (T) arr[0];
            arr[0] = 0;
            size--;
            front = 1;
            return f;
       }else if(size>0){
        T f =  (T) arr[front];
        arr[front] = 0;
        front++;
        size--;
        return f;
       }
       
       System.out.println("Array is empty");
       return null;
    }

    T peek() throws Exception{
        if(size==0){
            throw new Exception("Queue is empty");
        }
        return (T) arr[front];
    }

    boolean isFull(){
         if(size == length) return true;
        return false;
    }

    boolean isEmpty(){
        if(size > 0) return false;
        return true;
    }

    void print(){
           if(front>=rear){
             for(int i = front; i < length ; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i < rear ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
           }

            for(int j = front; j < rear; j++ ){
               System.out.print(arr[j] + " ");
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
        // System.out.println("peeked element: " + queue.peek());
        // System.out.println("removed element: " + queue.remove());
        // System.out.println( "rear " + queue.rear);
        // System.out.println( "front " + queue.front);
        // System.out.println("peeked element: " + queue.peek());
        queue.print();
        queue.remove();
        queue.remove();
        
        queue.push(1);
        queue.push(2);
        queue.print();





    }
}
