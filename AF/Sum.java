class SumOverloading{
	
	public void sum(int a, int b){
		System.out.println("Int sum = " + (a+b));
	}

	public void sum(double a, double b){
		System.out.println("double sum = "  + (a+b));
	}

}

public class Sum{
	public static void main(String[]str){
	
	SumOverloading sum = new SumOverloading();

	sum.sum(2,4);
	sum.sum(2.34, 2.34);
	
}
}