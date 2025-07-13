import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {
        Integer int1 = new Integer(10);

        Integer int2 = new Integer(10);

        System.out.println("int1 " + int1.hashCode());
        System.out.println("int2 " + int2);

        System.out.println("int1 refernce: " + System.identityHashCode(int1));
        System.out.println("int2 refernce: " + System.identityHashCode(int2));

        System.out.println(int1.equals(int2));  // true
        System.out.println(int1 == int2); // false beacuse it camprate:-  The == operator for objects in Java compares object references, i.e., it checks: Do both variables point to exactly the same object in memory?


        System.out.println(int1.hashCode()== int2.hashCode()); // true
        System.out.println("int1.hashCode() : " + int1.hashCode());
        System.out.println("int2.hashCode() : " + int2.hashCode());

        System.out.println("list and object");

        List list1 = new ArrayList();

        List <Object> list2 = list1;

        list1.add(10);

        list1.add(11);

        list1.add("mona") ;

        list1.add(true);

        System.out.println(list1);

        System.out.println(list2);

        System.out.println("list and object 2");
        
        List <Integer> mylist = new ArrayList<Integer>();

        Inserter in = new Inserter();

        in.doInsert(mylist);

    }
}

class Inserter {

    void doInsert(List <Integer>list) {

        list.add((1));

    }

}
