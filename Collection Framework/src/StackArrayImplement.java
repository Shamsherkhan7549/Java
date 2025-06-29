import java.util.Arrays;

class Stack {
    int size = 50;
    int index = 0;
    int[] arr = new int[size];

    void push(int element){ 
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[index] = element;
        index++;  

    }

    void print(){
        for(int i = 0; i < index; i++){
            System.out.print
            (arr[i] + " ");
        }

        System.out.println();
    }

    int peek(){

        if(index == 0){
            System.out.println("Index not available!");
            return -1;
        }

        return arr[index-1];
        
    }

    int pop(){

        if(index == 0){
            System.out.println("Index not available!");
            return -1;
        }
        int x = arr[index-1];
        arr[index-1] = 0;
        index--;
        return x;
    }
    
    int size(){

        System.out.println("Real size : " + size);
        return index;
    }

    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

     boolean isFull(){
        if(index == size) return true;
        else return false;
     
    }
    
}

public class StackArrayImplement {
 public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    
    stack.print();
    System.out.println("popped element: " + stack.pop());
    stack.push(6);
    stack.push(7);

    System.out.println("peeked element: " + stack.peek());
    stack.print();

    System.out.println("isEmpty : " + stack.isEmpty());
    System.out.println("size : " + stack.size());
    System.out.println("isFull : " + stack.isFull());


 }   
}
