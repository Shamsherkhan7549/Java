import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAssignment {
    /*
     * Print all elements present in given queue only using add(), remove(), peek(), size() and extra queue
     */
    public static void print(Queue<Integer> queue){
            Queue<Integer> q  = new LinkedList<>();
            
            while (!queue.isEmpty()) {
                int ele = queue.remove();
                System.out.print(ele + " "); 
                q.add(ele);
            }

            System.out.println();

            while(!q.isEmpty()){
                int ele = q.remove();
                queue.add(ele);
            }
    }

        static Queue<Integer> q2 = new ArrayDeque<>();

    // print reverse queue
    public static void printRev(Queue<Integer> q){
       recFunc(q); 
    }

    public static void recFunc(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }

        int n = q.poll();
        q2.add(n);
        recFunc(q);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(1);
        q.add(5);
        q.add(9);
        System.out.println(q);
        print(q);
        System.out.println(q);

        printRev(q);
        System.out.println(q);
        
    }
}
