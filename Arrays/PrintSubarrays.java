public class PrintSubarrays { 
    
    public static void printSubarrays(int[] number){
            for(int i = 0; i < number.length; i++){
                for(int j = i+1; j < number.length; j++){
                    for(int k = i; k <= j; k++){
                        System.out.print(number[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

     public static void main(String[] args) {
       
        System.out.println("print subarrays");

        int[] numbers = {2,4,6,5};
        printSubarrays(numbers);
    }
}
