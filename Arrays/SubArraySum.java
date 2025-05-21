public class SubArraySum {

    public static int subArraySum(int numbers[]){
        int noOfSubarray = 0;
        int subArraySum = Integer.MIN_VALUE;
       

        for(int i = 0; i < numbers.length; i++){
         
            for(int j = i+1; j < numbers.length; j++){
                noOfSubarray += 1;
                int tempSum = 0;
                for(int k = i; k <= j; k++){
                    tempSum += numbers[k];
                }
                if(tempSum>subArraySum){
                    subArraySum = tempSum;
                }
            }
        }

        System.out.println("no of sub array = " + noOfSubarray);
        return subArraySum;
    }
    public static void main(String[] args) {
        System.out.println("Subarray sum");

        int numbers[] = {2,4,6,5};
        System.out.println("Maximum sub array sum: " + subArraySum(numbers));
    }
}
