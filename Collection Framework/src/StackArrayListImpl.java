import java.util.ArrayList;

class Stack2{

    int index = 0;
    ArrayList<Integer> al = new ArrayList<>();

    void push(int a){
        al.add(a);
        index++;
    }

    void print(){
        System.out.println(al);
    }

    int peek(){
       return al.get(index-1);
    }

    int pop(){
        int x = al.remove(index-1);
        index--;
        return x;
    }

    boolean isEmpty(){
        if(size() == 0) return true;
        else return false;
    }

    boolean isFull(){
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
