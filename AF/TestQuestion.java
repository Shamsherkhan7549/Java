public class TestQuestion{

	public static boolean funcA(int a) {

	boolean b = (a==10)?true:false;

	System.out.println(b);

	return b;

	};

	public static void main(String[]srgs){

	if(funcA(10) && funcA(5)){

	System.out.println("pass");

	}

}
}
