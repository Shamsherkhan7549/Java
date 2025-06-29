import java.util.LinkedList;
import java.util.NoSuchElementException;


class Stack <T>{

    LinkedList<T> ll = new LinkedList<>();

    void push(T element){
        ll.addFirst(element);
    }

    T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            throw new NoSuchElementException("Stack is empty!");
        }

        return ll.getFirst();
    }

    T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            throw new NoSuchElementException("Stack is empty!");
        }

        return ll.removeFirst();
    }

    void print(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            throw new NoSuchElementException("Stack is empty!");
        }

        for(int i = 0; i < ll.size(); i++){
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
    }

    boolean isEmpty(){
        if(ll.size() == 0){
            return true;
        }
        return false;
    }

    int size(){
        return ll.size();
    }
   
}

public class StackLinkedListImpl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.print();
        System.out.println("Popped element : " + stack.pop());
        System.out.println("Peeked element : " + stack.peek());
        stack.print();
        System.out.println("Size : " + stack.size());
        System.out.println("isEmpty : " + stack.isEmpty());

         Stack<String> stack2 = new Stack<>();
        stack2.push("shamsher");
        stack2.push("rehan");
        stack2.push("samar");
        stack2.print();
        System.out.println("size stack2 : " + stack2.size());

    }
}
