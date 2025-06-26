import java.util.Scanner;
import java.util.Stack;

public class CopyStack {

    public static void copyStack(Stack<Integer> stack){
        Stack<Integer> stack2 = new Stack<>();
        int n = stack.size();

        while (n>0) {
            Integer ele = stack.pop();
            stack2.push(ele);
            n--;
        }

        System.out.println("Stack2 : " + stack2);

        Stack<Integer> stack3 = new Stack<>();

        n = stack2.size();
        while (n>0) {
            Integer ele = stack2.pop();
            stack3.push(ele) ;
            n--;
        }

        System.out.println("Stack3 : " + stack3);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n;

        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter size of Stack : ");
        n = sc.nextInt();

        System.out.print("Enter Number : ");
        while(n>0){
            
            int ele = sc.nextInt();
            stack.push(ele);
            n--;
        }

        sc.close();

        System.out.println("Stack : " + stack);

        copyStack(stack);
    }
}
