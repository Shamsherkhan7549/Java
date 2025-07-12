package ArraysFunctions;

import java.util.Arrays;

public class ArrayCopy {
    public static void printArray(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println("Original Array");
        printArray(arr);    // 1 2 3 4 5

        System.out.println("Copy Array");
        int[] arr2 = arr;   // It's store the reference not the actual value
        printArray(arr2);   // 1 2 3 4 5
        
        // arr2[4] = 0;
        // arr2[3] = 0;

        // System.out.println("Original Array after update in copy array");
        // printArray(arr2);   // 1 2 3 0 0 because arr2 changes the arr to using that's refference.we can call it shallow copy

        // System.out.println("Copy Array after update");
        // printArray(arr2);   // 1 2 3 0 0 

        // --> Arrays.copyOf(array,maximum_length);  it copy of an array with new memory location.we can call it deep copy
        System.out.println("Copy array arr3");
        int []arr3 = Arrays.copyOf(arr, arr.length); // it's clone the array and create new memory location in heap
        arr3[0] = 5;
        arr3[1] = 6;

        System.out.println("Original array after update in arr3");
        printArray(arr); 

        System.out.println("copy array after update in arr3");
        printArray(arr3);

        // --> Arrays.copyOfRange
        System.out.println("copy of arr3 is arr4");
        int[] arr4 = Arrays.copyOfRange(arr3, 1,3); 
        printArray(arr4);

        System.out.println("arr5 is clone of arr4");
        int arr5[] = arr4.clone();
        printArray(arr5);


    }
}
