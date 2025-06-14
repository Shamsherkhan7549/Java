public class PrintStar{
	
	public static void main(String[] str){


	/*
		wap to create L opposite shape using start
	*/

	System.out.println("L opposite shape- ");
	for(int i=1; i <=5; i++){
		for(int j = i; j <= 5; j++){
			System.out.print("*");

		}

		System.out.println();

	}
	

	/*
		wap to create L shape using start
	*/

	System.out.println("L shape- ");

	for(int i2=1; i2 <=5; i2++){
		for(int j = 1; j <= i2; j++){
			System.out.print("*");

		}

		System.out.println();

	}


	/*
		wap to create L shape using star , 3 times
	*/

	System.out.println("L shape 3 times - ");

	for(int k=1; k<=3; k++)
	for(int i=1; i <=5; i++){
		for(int j = 1; j <= i; j++){
			System.out.print("*");

		}

		System.out.println();

	}

}

}