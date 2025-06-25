import java.util.Stack;

public class StacksDemo {
    public static void main(String str[]){
        Stack<Integer> s = new Stack<>();
        System.out.println(s.isEmpty());

        s.push(1);
        s.push(1);
        s.push(2);
        s.push(3);
        // s.push(2.67); // this will work when we not defined wrapper class(Integer) while creating object
        // s.push("shamsher");
        System.out.println(s);
        System.out.println(s.peek());
        s.pop(); // for delete
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.search(1));

        



    }
}
