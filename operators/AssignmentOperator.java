public class AssignmentOperator {
    public static void main(String[] args) {
        // Assignment operators: =, +=, -=, */, /=, %=

        int a = 10;
        
        int b = a; // = assign value of a into b;
        System.out.println(b);

        a += 2;
        int c = a;
        System.out.println(a);
        System.out.println(c);

        a -= 2;
        System.out.println(a);

        a /= 2 ;
        System.out.println(a);

        a %= 2;
        System.out.println(a);
        
    }
}
