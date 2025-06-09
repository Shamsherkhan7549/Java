public class ThreeDArray{
 public static void main(String[] str){

       int [][][]arr = {{{1,2,3},{4,5,6,5}},{{7,8,9,1},{10,11,12},{10,11,12}}}; 
      // System.out.println(arr[0][0][1]);

	int sum = 0;
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=0;j<arr[i].length;j++)
    	   {
    		   for(int k=0;k<arr[i][j].length;k++)
    		   {
				sum += arr[i][j][k];
    			   System.out.print(arr[i][j][k]+" ");
    		   }
    		   System.out.println();
    	   }
		System.out.println("sum = "+ sum);
		sum = 0;
    	   System.out.println();
       }



}
}