
    class Student{

        // ✅ Encapsulation → Data is private, accessed via methods
        // ✅ Getter & Setter → Control how variables are accessed & modified.
        //✅ Security & Validation → Protects invalid data entry.

      //  8. Getter and Setter Methods
      //  ✅ Getter methods return the value of a private variable.
      //  ✅ Setter methods modify the value of a private variable.

        private String name;
        String name2;
        //setter method
        void setName(String name){
            this.name = name;
        }

        //Getters Method
        String getName(){
            return name;
        }

        void printName(String name2){
            System.out.println(name2);
        }
    }

public class GetterSetter {
    public static void main(String[] args){
        System.out.println("Getters and Setters Method");

        Student s1 = new Student();
        s1.setName("shamsher");
        System.out.println("private name = " + s1.getName());
        s1.printName("rehan");
        System.out.println(s1.name2);

    }
}
