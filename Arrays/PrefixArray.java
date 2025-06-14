public class PrefixArray {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int prefArray[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        prefArray[0] = arr[0];
        for(int i = 1 ; i < prefArray.length; i++){
           prefArray[i] = prefArray[i-1] + arr[i];
        }
            System.out.println();
        for(int i = 0 ; i < arr.length; i++){
          for(int j = i+1; j < arr.length; j++){
             currSum = i == 0 ? prefArray[j] : prefArray[j] - prefArray[i-1];

            if(maxSum<currSum) maxSum = currSum;

          }
        } 
        
        System.out.println(maxSum);

    }
}
