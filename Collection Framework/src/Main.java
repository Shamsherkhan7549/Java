import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Creating Array List of Number
        List<Integer> list = new ArrayList<>();
        System.out.println(list);
        // Methods in ArrayList

        //a) Adding Element
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);

        list.addFirst(0);
        System.out.println(list);

        list.addLast(3);
        System.out.println(list);

        //b) Access Element
        int position = list.get(4); // Retrieve Element at index 4
        System.out.println(position);

        //c) Modifying Element
        list.set(2,7); // Replaces element at index 2 with "Grapes"
        System.out.println(list);
        list.set(2,8);
        System.out.println(list);

        //(d) Removing Elements
        list.remove(1);
        System.out.println(list);
        list.add(1,9);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        //(e) Checking Size
        int size = list.size();
        System.out.println(size);

        // (f) Checking if Element Exists
       boolean isExist =  list.contains(8);
        System.out.println(isExist);
        boolean isExist2 =  list.contains(10);
        System.out.println(isExist2);

        //(g) Iterating Through an ArrayList
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        list.forEach(item-> System.out.print(item + " "));

        System.out.println();
        // 3) Sorting ArrayList
        Collections.sort(list);  // Sorting in ascending order
        System.out.println(list);

        //4. Converting ArrayList to Array
        Integer[] intArray = list.toArray(new Integer[0]);
        // Printing the array
        for (Integer num : intArray) {
            System.out.println("intArray " + num);
        }

        // 5. Clearing an ArrayList
        list.clear(); // Removes all element
        System.out.println(list);

        // 6. Checking If ArrayList is Empty
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);

        // 7. Using ArrayList with Custom Objects
        List <Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("Neha", 23));
        teachers.add(new Teacher("Sheetal", 26));
        teachers.add(new Teacher("Himansu",20));

        System.out.println(teachers);

        teachers.forEach(teacher-> System.out.println(teacher));

        List<String> name = new ArrayList<>();
        name.add("sam");
        name.add("rod");
        name.add("doe");
        System.out.println(name);
        name.remove("rod");
        System.out.println(name);

        Iterator<String> it = name.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}

class Teacher{
    String name;
    int age;
    Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }
    public  String toString(){
        return name + "[" + age + "]";
    }
}