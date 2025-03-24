# Collection Framework
                         Collection (Interface)
                                │
        ┌──────────────────────────────┬───────────────────────────┐
        │                              │                           │
      List (I)                        Queue (I)                  Set (I)
        │                              │                           │
   ┌────┴────┐                ┌────────┴─────────┐          ┌──────┴───────┐
   │         │                │                  │          │              │
   │         │                │                  │          │              │
ArrayList LinkedList      PriorityQueue        Deque      HashSet       SortedSet (I)
                          (Implements Queue)      │          │              │
                                               ┌──┴──────┐ LinkedHashSet    TreeSet          
                                               │         │
                                          ArrayDeque  LinkedList (as Deque)
   

# ARRAY LIST

                List (Interface)
                      │
        ┌─────────────┴─────────────┐
        │                           │
    ArrayList                   LinkedList
        │                           │
      Vector                    Stack (extends Vector)


# ARRAY LIST 
    An ArrayList in Java is a resizable array implementation of the List
    interface in the Java Collections Framework (JCF). Unlike regular arrays,
    which have a fixed size, an ArrayList can dynamically grow and shrink as 
    elements are added or removed.

     // Creating Array List of Number
        List<Integer> list = new ArrayList<>(); // if you want flexibility.
        ArrayList<Integer>list = new ArrayList<>() // if you're sure you'll always use an ArrayList.

# Common Methods in ArrayList
## a) Adding Elements
    list.add(1);
    list.addFirst(0);
    list.addLast(2);
    list.add(1,9); // add 9 at index 1.
## b) Access Element
    list.get(1); // where 1 is the index number

## c) Modifying Element
    list.set(2,4) // Replaces element at index 2 with "Grapes"

## (d) Removing Elements
    list.remove(8); // Removes at index 8
    name.remove("rod"); // Remove element "rod"
## (e) Checking Size
    list.size(); // Return size

## (f) Checking if Element Exists
    boolean isExist =  list.contains(8); // Return true/false
        System.out.println(isExist);

## 3. Sorting an ArrayList
    Use Collections.sort() to sort an ArrayList in ascending order.
    Collection.sort(list);
## 4. Converting ArrayList to Array
        Integer[] intArray = list.toArray(new Integer[0]);
        // Printing the array
        for (Integer num : intArray) {
            System.out.println("intArray " + num);
        };

        // intArray is the Changed form of arraylist list

## 5.Clearing an ArrayList
        list.clear(); // Removes all element
        System.out.println(list);

## 6. Checking If ArrayList is Empty
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);

# Vector
    A Vector in Java is a dynamic, resizable array that is part of the Java Collections
    Framework (JCF). It is synchronized, meaning it is thread-safe and can be used in 
    multithreaded environments. A Vector maintains the insertion order of elements and 
    allows duplicate values.

    Unlike ArrayList, which is not synchronized, Vector ensures that only one thread 
    can modify it at a time, making it slightly slower but safer for concurrent 
    programming.

## 🔹 Key Features of Vector
    ✅ Resizable (Dynamic Array) → Expands automatically when needed.
    ✅ Thread-Safe (Synchronized) → Safe for multi-threaded programs.
    ✅ Slower than ArrayList → Due to synchronization overhead.
    ✅ Duplicates Allowed → Can store duplicate elements.
    ✅ Maintains Insertion Order → Elements remain in the same order as added.

## Common Methods
    Common methods are same as Array list

    Note :-> Vector increased by double while arrayList increased by 50%






