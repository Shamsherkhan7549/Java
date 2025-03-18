public class LogicalOperator {
    public static void main(String[] args) {
        //Logical operators:- &&(Logical AND), ||(Logical OR), !(Logical NOT);

        int a = 10;
        int b = 5;

        // && Logical AND :- In && operator, both condition should be true;
         System.out.println(a==10 && b > 4);

         // || Logical OR :- In || operator, one of the condition should be true;
         System.out.println(a>5 || b<5);

         // ! (Logical NOT) :- In ! operator, true condition false and false condion give true basically it is negation of true
         System.out.println(!(a==10));
         System.out.println(!(a>20));


    }
}
