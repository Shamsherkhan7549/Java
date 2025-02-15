public class InstancesMethod {

    //An instance method is a method that operates on an instance (object) of a class. These methods are not static and require an object of the class to be called.
    //Declaration
        public void functionName(){
            System.out.println("This is an Instances Function.");
        }

    public static void main(String args[]){
       InstancesMethod func = new InstancesMethod();
       func.functionName();
    }
}
