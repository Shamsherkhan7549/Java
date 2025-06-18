import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber{

    public static int[] missingNumber(int arr[][]){
        int n = arr.length;
        int size = n*n;
        int count[] = new int [size+1];
        ;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                count[arr[i][j]]++;
            }
        }

        int r = -1, m = -1;

        for(int i =0; i < count.length; i++){
            if(count[i] == 2){
                r = i;
            }

            if(count[i] == 0){
                m = i;
            }
        }

        return new int[] {r, m};
       
    }
public static void main(String[] args) {
    int arr[][] = {{9,1,7},{8,9,2},{3,4,6}};
    System.out.println(Arrays.toString(missingNumber(arr)));
    
}
}