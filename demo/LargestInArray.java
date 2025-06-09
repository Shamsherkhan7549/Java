public class LargestInArray{
	public static void main(String[] str){
	

	int[][] numbers = {
				{3,1,5},
				{4,3,1,4,7},
				{7,4,5,8}
			};


	for(int r = 0; r < numbers.length; r++){
		int sum  = 0;
		for(int c = 0; c < numbers[r].length; c++){
				sum += numbers[r][c];
				System.out.print(numbers[r][c] + " ");
			};
			System.out.print(" , sum = " + sum);

		System.out.println();
	};


// Second Largest

	 int []arr = {3,1,6,2,9,8};
     	int max =arr[0];
	int sMax = arr[0];
	
    	 for(int data:arr)
     	{
    		if(max < data){
			sMax = max;
			max = data;
		}else if(data>sMax && data != max){
			sMax = data;
		}

		
     	}

    	 System.out.println("Largest element: "+" "+max);
	System.out.println("Second Largest element: "+" "+sMax);

}}