public class MaxSubArraySum {
    public static void main(String[] str){
        int numbers[] = {1,-2,6,-1,3};
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("{");
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k] + ", ");
                    sum += numbers[k];
                }
                System.out.print("}");
                    System.out.print( "   sum = " +sum);
                    if(maxSum<sum) maxSum = sum;
                    sum = 0;
                
            }

           
        }

        System.out.println("Maximum sum = "+  maxSum);
    }
}
