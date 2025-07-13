package ArraysFunctions;

public class ArraysAssignments2 {
    // 1. Find the total number of pairs in the Array whose sum is eual to the given value x.
    public static int numberOfPairs(int[]arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                    count++;
                    System.out.println(i + ", " + j);
                }
             }
        }

        return count;
    }

    // 2. Find the total number of triplets in the Array whose sum is eual to the given value x.
    public static int noOfTriplets(int arr[], int target){
          int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        count++;
                        System.out.println(i + ", " + j + ", " + k);
                    }
                }
            }
        }

        return count;
    }

    //  3. Find the unique number in a given Array where all the elements are being repeated twice with one value being unique
    public static int uniqueValue(int arr[]){
        int unique = -1;
       for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            } 
       }

         for(int j = 0; j < arr.length; j++){
            if(arr[j]>0){
               unique = arr[j];
            }
        } 
        return unique;
    }

    // 4. Find the second largest element int the given array

    public static int largest(int[]arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i <  arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findSecMax(int arr[]){
        int max = largest(arr);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        max = largest(arr);

        return max;
    }

    //  5. Givent an array 'a' consisting og integer. Return the first value that is repeating in this array.
    // If no value is being repeated, return -1;

    public static int firstRepeatingValue(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }

        return -1;
    }

    // 6. Find the second smallest element int the given array
    public static int smallest(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void findSecondSmallest(int arr[])
    {
        int min = smallest(arr);
        System.out.println(min);
    }
    
    public static void main(String[] args) {
        int arr[] = new int[7];
        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 1;
        arr[4] = 3;
        arr[5] = 2;
         arr[6] = 1;

        //  1.
        int numberOfPairs = numberOfPairs(arr, 7);
        System.out.println("numberOfPairs : " + numberOfPairs);

        // 2.
        int noOfTriplets = noOfTriplets(arr, 7);
        System.out.println("noOfTriplets : " + noOfTriplets);

        // 3.
        // int unique = uniqueValue(arr);
        // System.out.println("unique : " + unique);

        // 4.
        int secondLargest = findSecMax(arr);
        System.out.println("secondLargest : " + secondLargest);

        // 5. 
        int firstRepeatingValue = findSecMax(arr);
        System.out.println("firstRepeatingValue : "+ firstRepeatingValue);

        //  6.
        // int secondSmallest = findSecondSmallest(arr);
        // System.out.println("secondSmallest : " + secondSmallest);
        System.out.println("smallest " + smallest(arr));
    }
}
