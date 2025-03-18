package Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        //Array is a collection of elements of same datatype which has contiguous memory location;
        //Creating an array
        //datatype arrayName[] = new dataType[size];

//        int nums[] = new int[5];
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("length of array = "+ nums.length);
//
//        int i =  0;
//
//        while(i<nums.length){
//            System.out.println("Enter the number");
//             int number = sc.nextInt();
//             nums[i] = number;
//            System.out.println(nums[i]);
//
//            i++;
//        }

        // 2D Array

        System.out.println("2D Array");

        int numbers[][] = new int[2][4];
        Scanner scn = new Scanner(System.in);

//        int j = 0;
//        int k = 0;
//        while(j<numbers.length){
//            while(k<numbers[0].length){
//                System.out.println("Enter numbers");
//                 numbers[j][k] = scn.nextInt();;
//
//                k++;
//            }
//
//            j++;
//        };

         int numbers2[][] = {{10,20,30,40},{50,60,70,80}};

        int j2 = 0;
        int k2 = 0;
        while(j2<numbers2.length){
            System.out.println(j2);
            while(k2<numbers2[0].length){
                System.out.print(numbers2[j2][k2]+", ");
                k2++;
            }
            System.out.println();
            j2++;
        };



    }
}
