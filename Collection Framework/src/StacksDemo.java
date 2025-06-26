import java.util.Stack;

public class StacksDemo {
    /*
     * copy contents of one stack to another in same order
     */

     static void copyStack(Stack<Integer> stack){
        Stack<Integer> stack2 = new Stack<>();

        int size = stack.size();
        while (size>0) {
            Integer ele = stack.pop();
            stack2.push(ele);
            size--;
        }        

       System.out.println("Stack2 : " + stack2);

        Stack<Integer> stack3 = new Stack<>();
        size = stack2.size();
       while (size>0) {
            Integer ele = stack2.pop();
            stack3.push(ele);
            size--;
       }


       System.out.println("Stack3 : " + stack3);
        return ;

     }

    public static void main(String str[]){
        Stack<Integer> s = new Stack<>();
        // System.out.println(s.isEmpty());

        s.push(1);
        s.push(1);
        s.push(2);
        s.push(3);
        // s.push(2.67); // this will work when we not defined wrapper class(Integer) while creating object
        // s.push("shamsher");
        // System.out.println(s);
        // System.out.println(s.peek());
        // s.pop(); // for delete
        // System.out.println(s);
        // System.out.println(s.size());
        // System.out.println(s.isEmpty());
        // System.out.println(s.search(1));

        System.out.println("stack : " + s);
        copyStack(s);

        



    }
}
