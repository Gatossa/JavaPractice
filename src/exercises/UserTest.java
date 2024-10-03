package exercises;

public class UserTest {

    public static void main(String[] args) {
        //User user= new User();
        User user=new User("adam", "hello");

        //user.username= "adam";
        //user.password= "qwerty";


        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
