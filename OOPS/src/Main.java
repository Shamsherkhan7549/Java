
class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void studentDetails(){
        System.out.println("Name is " + name + "and is " + age + ".");
    }
}

public class Main {
    // OOPS
    // OOPS (Object-Oriented Programming System) is a programming paradigm that uses objects and classes to design and structure software. It helps in organizing complex programs by modeling real-world entities.
    // 4 pillars of OOPS:- 1> Encapsulation 2> Inheritance 3> Abstraction 4> Polimorphism
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Student s1  = new Student("shamsher", 24);
        System.out.println(s1.name);
        s1.studentDetails();
    }
}