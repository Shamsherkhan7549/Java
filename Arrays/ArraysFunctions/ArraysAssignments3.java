package ArraysFunctions;

public class ArraysAssignments3 {
    // 1. Given 2 integers a and b. Swap the 2 given values using temporary variables
    public static void swap(int m, int n){
        int temp = m;
        m = n;
        n = temp;

       System.out.println("m : " + m + ", " + "n : " + n);
    }
    public static void main(String[] args) {
        swap(2,3);

    }
}
