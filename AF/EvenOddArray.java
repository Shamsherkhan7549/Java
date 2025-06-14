public class EvenOddArray{
	public static void main(String[] str){
	
	int []num = {10,20,35,40,55};
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum +=num[i];
			if(num[i]%2==0)System.out.print(num[i] + " is even, ");
			else System.out.print(num[i] + " is odd, ");


			//System.out.print(num[i]+"\t");
		}
		System.out.println("Sum"+" "+sum);


}

}