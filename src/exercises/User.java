package exercises;

public class User {

    public String username;
    public String password;

    /*public User(){};
     public User(String user, String pass) {
         System.out.println("Hello z kontruktora");
         username=user;
         password=pass;*/

     public User(String username, String password) {
         System.out.println("Hello z kontruktora");
         this.username=username;
         this.password=password;


     }

    public void sayHello(){
        System.out.println("Hello, my name is " + username);
    }
}
