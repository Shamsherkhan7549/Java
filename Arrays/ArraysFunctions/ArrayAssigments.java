package ArraysFunctions;

import java.util.Arrays;

public class ArrayAssigments {

    // 1.  Count the number of occurences of a particular element.

    public static int noOfOccurence(int []arr, int n){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                count++;
            }
        }

        return count;
    }

    // 2. find last occurences of a particular element.
    public static int lastOccurrence(int[]arr, int x){
            int lastOccurrence = -1;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == x){
                    lastOccurrence = i;
                }
            }

            return lastOccurrence;
    }

    // 3. Count the number of elements strictly greater than value x
    public static int greaterThenX(int[]arr, int x){
         int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }

        return count;
    }

    // 4. Check it the given array is sorted or not
    public static boolean isSorted(int arr[]){
        int prev = 0;
        for(int i = 1; i < arr. length; i++){
            if(!(arr[prev] <= arr[i])){
                return false;
            }
            prev++;
        }
        return  true;
    }

    // 5. Return an array which first value will be smallest and last value will be largest value of given array;
    public static int[] smallestAndLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
          if(arr[i]>max){
            max = arr[i];
          }

          if(arr[i]<min){
            min = arr[i];
          }

        }

        return new int[]{min, max};
        
    }

    public static int[] smallestAndLargest2(int arr[]){
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length-1]};
    }

    // 6. Return an array which first value will be Kth smallest and last value will be Kth largest value of given array;
    public static int[] kThsmallestAndKThLargest(int arr[], int k){
        Arrays.sort(arr);
        return new int[]{arr[k-1], arr[arr.length-k]};
    }

    // print array
     public static void printArray(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[8];
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 9;
        arr[5] = 3;
        arr[6] = 8;
        arr[7] = 1;
        printArray(arr);
        System.out.println("length of arr" + arr.length);
        //1.
        int noOfOccurence = noOfOccurence(arr, 4);
        System.out.println("occurence = " + noOfOccurence);

        //2.
        int lastOccurrence = lastOccurrence(arr, 4);
        System.out.println("last Occurence : " + lastOccurrence);

        //3.
        System.out.println("count of values greater the x = " + greaterThenX(arr, 3));

        // 4.
        System.out.println("isSorted : " + isSorted(arr));

        // 5.
        // int []newArr = smallestAndLargest(arr);
        int []newArr = smallestAndLargest2(arr);
        printArray(newArr);

        // 6.
        int []newArrK = kThsmallestAndKThLargest(arr, 2);
        printArray(newArrK);
       
    }
}
