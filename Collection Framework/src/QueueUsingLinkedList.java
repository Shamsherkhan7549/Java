import java.util.NoSuchElementException;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
    }
}

class Queue<T>{
    Node<T> head = null;
    Node<T> tail = null;
    int size = 0;


    void push(T element){
        Node<T> newNode = new Node<>(element);

        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    T remove(){
        if(isEmpty()){
            throw new NoSuchElementException();
        };
        T data = head.data;
      head = head.next;
      size--;
      return data;
    }

    T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        };
        return head.data;
    }

    boolean isEmpty(){
        if(size > 0) return false;
        return true;
    }

    void print(){
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
       Queue<Integer> queue = new Queue<>();
       System.out.println("isEmpty : " + queue.isEmpty());

       queue.push(3);
       queue.push(2);
       queue.push(8);
       queue.push(1);
       queue.print();
       System.out.println("size = " + queue.size);
       System.out.println("peeked element = " + queue.peek());
       System.out.println("removed element = " + queue.remove());
       System.out.println("peeked element = " + queue.peek());
       System.out.println("size = " + queue.size);
       queue.print();

       System.out.println("isEmpty : " + queue.isEmpty());

    }
}