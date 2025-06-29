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
    int size = 0;
    void push(T element){
        Node<T> temp = new Node<>(element);
        temp.next = head;
        head = temp;
            size++;

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
            size--;

        return temp;
    }

    void print(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty!");
        }
        displayRec(head);
    }

    void displayRec(Node<T> temp){
            if(temp == null){
            return;
            }
            displayRec(temp.next);
            System.out.print(temp.val + " ");

        }

    boolean isEmpty(){
        if(head == null) return true;
        return false;
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
        System.out.println("Size : " + str.size);
        System.out.println(" Peeked element : " + str.peek());
        System.out.println(" Popped element : " + str.pop());
        str.print();
        System.out.println("Size : " + str.size);

    }
}
