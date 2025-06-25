import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int numbers[]){
        int temp;
        int n = numbers.length;

        for(int i = 0; i <= n/2; i++, n--){
            temp = numbers[n-1];
            numbers[n-1]  = numbers[i];
            numbers[i] = temp;
        }
        
        return numbers;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        
        reverseArray(numbers);

        System.out.println(Arrays.toString(numbers));


    }
    
}
