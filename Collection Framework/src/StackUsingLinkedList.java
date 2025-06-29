import java.util.NoSuchElementException;

class Node<T>{
    T val;
    Node<T> next;

    Node(T val){
        this.val = val;
    }

}

class Stack<T>{
    Node<T> head = null;

    void push(T element){
        Node<T> temp = new Node<>(element);
        if(head == null){
            head = temp;
            return;
        }

        temp.next = head;
        head = temp;
    }

    T peek(){
        if (isEmpty())
            throw new NoSuchElementException("Stack is empty!");

        return head.val;
    }

     T pop(){
        if (isEmpty())
            throw new NoSuchElementException("Stack is empty!");

        T temp = head.val;
        head = head.next;
        return temp;
    }

    void print(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty!");
        }

        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    boolean isEmpty(){
        if(head == null) return true;
        return false;
    }

    int size(){
        int size = 0;

        Node<T> temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }


}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack<String> str = new Stack<>();
        str.push("samar");
        str.push("sher");
        str.push("khan");
        str.push("rehan");
         str.print();
        System.out.println("Size : " + str.size());
        System.out.println(" Peeked element : " + str.peek());
        System.out.println(" Popped element : " + str.pop());
        str.print();
        System.out.println("Size : " + str.size());

    }
}
