public class Ecapsulation {
    public static void main (String [] args){
        System.out.println("Encapsulation");

        User user = new User();
        user.setPassword("shams123");
        System.out.println(user.getPassword());
    }
}

class User {

     // Ecapsulation:- Encapsulation is defined as the wrapping up of data & methods under a single unit.It also implements data hiding
    // private, default , protected, public

    String username;
    private String password;

    void  setPassword(String password){
        this.password = password;
    }

    String getPassword(){
        return this.password;
    }
}
