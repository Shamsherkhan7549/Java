import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
         Set set = new TreeSet();

        set.add("one");

        set.add("two");

        set.add("three");

        set.add("four");

        set.add("one");

        Iterator it = set.iterator();

        while(it.hasNext()) {

            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("Navigable set");
          NavigableSet<Integer> ns = new TreeSet<Integer>();

        ns.add(10);
        ns.add(15);
        ns.add(7);

        Iterator descendingIterator = ns.descendingIterator();

        if (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        List s = new ArrayList<String>();
        s.add("ncie");
        System.out.println(s);

        List<String> student = new ArrayList<String>();

        student.add("Vikash");

        student.add("Suchita");

        String name = "Deepak";

        Object stdnt = new String("Shivam");

        student.add(name);

        //student.add(stdnt);
    }
}
