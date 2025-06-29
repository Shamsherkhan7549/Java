import java.util.ArrayList;
import java.util.NoSuchElementException;

class Stack2{

    int index = 0;
    ArrayList<Integer> al = new ArrayList<>();

    void push(int a){
        al.add(a);
        index++;
    }

    void print(){
       if(isEmpty()){ 
            System.out.println("Stack is empty!");
            return;
        };
        for(int i = 0; i < al.size(); i++){
            System.out.print(al.get(i) + " ");
        };
    }

    int peek(){
        
        if(isEmpty()){
            System.out.println("Stack is empty");
            throw new NoSuchElementException("Stack is empty");
        }

       return al.get(index-1);
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            throw new NoSuchElementException("Stack is empty");
        }
        int x = al.remove(index-1);
        index--;
        return x;
    }

    boolean isEmpty(){
        if(size() == 0) return true;
        else return false;
    }

    boolean isFull(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            throw new NoSuchElementException("Stack is empty");
        }
        if(index == size()) return true;
        else return false;
    }

    int size(){
        return al.size();
    }

}

public class StackArrayListImpl {
    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        System.out.println("peeked element : " + stack.peek());
        System.out.println("popped element : " + stack.pop());
        stack.push(9);
        stack.push(10);
        System.out.println("size : " + stack.size());
        System.out.println("isEmpty : " + stack.isEmpty());
        // System.out.println("isFull : " + stack.isFull()); //this will give always true because arraylist give the same size as index value



        stack.print();
    }
}
