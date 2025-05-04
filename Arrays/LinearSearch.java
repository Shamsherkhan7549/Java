package Arrays;

public class LinearSearch {

    public static int findIndex(int numbers[], int target){
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] == target){
                    return i;
                }
            }

            return -1;
    }
    public static void main(String[] args) {
        System.out.println("LinearSearch");

        int numbers[] = new int[5] ;

        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;

        int nums[] = {1,2,3,4,5};

        int target = 3;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                System.out.println(i);
            }

        }
        System.out.println();

        int i = findIndex(numbers, 6);
        System.out.println("index of target = "  + i );

    }
}
