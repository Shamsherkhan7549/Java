import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
       Queue<Integer> queue = new ArrayDeque();
       System.out.println(queue.isEmpty());
       queue.add(5); // use to add data in queue
       queue.add(6);
       queue.add(2);
       queue.add(4);
       System.out.println(queue);
       System.out.println("size = " + queue.size());
       System.out.println(queue.isEmpty());

       queue.remove(); // use to remove first element of queue
       System.out.println(queue);
       int firstElement = queue.peek();  // use to see first element of queue
       System.out.println(firstElement);

       queue.poll();  // use to remove first element of queue
       System.out.println(queue);

        int firstElement2 =  queue.element(); // use to see first element of queue
        System.out.println(firstElement2);
        System.out.println(queue);
        System.out.println("size = " + queue.size());
    }
}
