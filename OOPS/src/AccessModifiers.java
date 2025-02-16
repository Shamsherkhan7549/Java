public class AccessModifiers {

    public static void main(String [] args){
        System.out.println("Access Modifiers or Access Specifiers");

        //Access Modifiers or Specifiers :- Access modifiers are keywords in programming languages that define the scope and accessibility of variables, methods, and classes. They help enforce encapsulation by restricting direct access to certain parts of the code.

        // Access Modifiers   -  Within class  -  Within Package    -   outside package by sublcass only   -     outside package

        //Private                      Y                N                             N                                 N

        //Default                      Y                Y                             N                                 N

        //Protected                    Y                Y                             Y                                 N

        //public                       Y                Y                             Y                                 Y

        BankAccount ba = new BankAccount();
        ba.setPassword(123);
        System.out.println(ba.getPassword());
        ba.changeUsername("shamsher");
        System.out.println(ba.usename);


    }
}

class  BankAccount{
    public String usename;
    private int password;

    void setPassword(int password){
        this.password = password;
    }

    int getPassword(){
        return this.password;
    }

    void changeUsername(String username){
        this.usename = username;
    }


}
