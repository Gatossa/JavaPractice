package exercises;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("pear");

        System.out.println(fruits.contains("a"));
        System.out.println(fruits.size());
        for (String fruit : fruits) {
            System.out.println(fruit);


        }
    }
}
