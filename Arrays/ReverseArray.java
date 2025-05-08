import java.util.Arrays;

public class ReverseArray {

    public static int[] findIndex(int numbers[]){
        int temp;
        int n = numbers.length;

        for(int i = 3; i <= n-1; i++, n--){
            temp = numbers[n-1];
            numbers[n-1]  = numbers[i];
            numbers[i] = temp;
        }
        
        return numbers;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        
        findIndex(numbers);

        System.out.println(Arrays.toString(numbers));
    }
    
}
