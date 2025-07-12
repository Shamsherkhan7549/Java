import java.util.Deque;
import java.util.LinkedList;

public class DequeAssingments {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1); // its also add at last
        deque.add(2);
        deque.add(3);
        deque.add(4);
        // System.out.println(deque);
        // deque.addFirst(5);
        // deque.addLast(6);
        // System.out.println(deque);
        // deque.remove(); // remove from first
        // System.out.println(deque);
        // deque.removeFirst();
        // System.out.println(deque);
        // deque.removeLast();
        // System.out.println(deque);

        Deque<Integer> deque2 = new LinkedList<>();
        deque2.addLast(1);
        deque2.addLast(11);
        System.out.println(deque2);
        deque2.addAll(deque); // add at last
        System.out.println(deque2);

        // deque2.removeFirstOccurrence(1);
        // System.out.println(deque2);

        // deque2.removeLastOccurrence(1);
        // System.out.println(deque2);

        deque2.removeFirstOccurrence(deque);  // it won't work
        System.out.println(deque2);

        /* note: normal add() and remove() work like queue*/





    }
}
