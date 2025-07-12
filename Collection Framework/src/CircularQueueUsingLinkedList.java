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
        Node<T>  newNode = new Node<>(element);

        if(head == null){
            head = tail = newNode;
            tail.next = head;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        size++;
    }

    T remove() throws Exception{
        if(size==0) {
            throw new Exception("Queue is empty");
        }

        T data = head.data;
        head = head.next;
        tail.next = head;

        return data;
    }

    T peek() throws Exception{
        if(size == 0){
            throw new Exception("Queue is empty");
        }
        return head.data;
    }

    void print(){
         if(size==0) {
            System.out.println("Queue is empty");
        }
        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            if(temp == head){
                return;
            }
        }

        System.out.println();
    }
    
}


public class CircularQueueUsingLinkedList {
    public static void main(String[] args) throws Exception {
       Queue<String> queue = new Queue<>();
       queue.push("sham");
       queue.push("sher");
       queue.push("khan");
       queue.print();
       System.out.println(" removed data : " + queue.remove());
       queue.print();
      queue.push("khan");
       queue.print(); 
       System.out.println(" peeked data : " + queue.peek() );

    }
}
