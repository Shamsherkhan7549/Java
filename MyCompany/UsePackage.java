package MyCompany;

import MyCompany.MyPackage;

public class UsePackage {
    public  static void main(String[] args){
        System.out.println("User custom package");
        MyPackage myPackage = new MyPackage();
        myPackage.greet("Alice");
    }
}
