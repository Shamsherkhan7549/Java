public class WrapperClass {

    public Integer val;

    public void fun1(){
        Integer grade1 = new Integer(25);
        val = grade1; //value stores the referrence
        System.out.println("grade1 = " + grade1);
        fun2(grade1);
    }

    private void fun2(Integer grade2){
        grade2 = grade2.intValue();
        if(val==grade2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void main(String[] args) {

        WrapperClass ws = new WrapperClass();

        ws.fun1();
        
    }
}
