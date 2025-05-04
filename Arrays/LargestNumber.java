package Arrays;

public class LargestNumber {
    public static int largestNumber(int nums[]){
        int largest = Integer.MIN_VALUE;
       
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>largest)
            largest = nums[i];
        }

        return largest;
    }

    public static int smallestNumber(int nums[]){
        int smallest = Integer.MAX_VALUE;
       
        for(int i = 0; i < nums.length; i++){
            if(nums[i]<smallest)
            smallest = nums[i];
        }

        return smallest;
    }

    
    public static void main(String[] args) {
        System.out.println("LAGEST NUMBER");
        System.out.println();

        int numbers[] = {2,3,9,5,6,7};

        System.out.println("largest number = " + largestNumber(numbers));
        System.out.println("smallest number = " + smallestNumber(numbers));
    }
}
