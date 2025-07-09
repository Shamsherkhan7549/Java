import java.util.NoSuchElementException;

class Queue<T>{
    static int rare;
    static int front;
    static Object arr[] = new Object[50];

    void add(T str){
        arr[rare] = str;
        rare++;
        
    }

    T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        T removedValue = (T) arr[front];
        front++;
        return removedValue;
    }

    T peek(){
        return (T)arr[front];
    }

    int size(){
        int size = rare - front;
        return size;
    }

    boolean isEmpty(){
        if(size() > 0) return false;
        return true;
    }



   void print(){
        for(int i = front; i < rare; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue<String> froots =  new Queue<>();

        froots.add("mango");
        froots.add("orange");
        froots.add("banana");

        froots.print();
        froots.size();

        String remValue = froots.remove();
        System.out.println("removed value " + remValue);

        System.out.println("peeked value " + froots.peek());

        froots.print();

    }
}
