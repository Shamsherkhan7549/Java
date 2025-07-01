package in.skcoding.multithreading;

public class AllTasks {
	public static void main(String[] str) {
		
		long startTime = System.currentTimeMillis();
		
		StarTask star = new StarTask();
	
		DollarTask dollar = new DollarTask();
		
		HashTask hash = new HashTask();
		
		
		star.start();
		dollar.start();
		hash.start();
		
		long endTime = System.currentTimeMillis();
		
		System.out.printf("Execution time : %d ", endTime - startTime);
	}
}
