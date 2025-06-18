import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAssignment {
    /*
     * Question 1:Given an integer array nums, return true if any value appears
     * at least twice in the array, and return false if every element is distinct.
     */

     public static boolean checkRepeataion(int arr[]){
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[i] == arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;

     }
    public static void main(String[] args) {
        int nums[] =  {1,2,3,1};
        System.out.println(checkRepeataion(nums));
    }
}
