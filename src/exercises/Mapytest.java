package exercises;

import java.util.HashMap;
import java.util.Map;

public class Mapytest {

    public static void main(String[] args) {

        Map<Integer, String > students= new HashMap<>();
        students.put(1, "Adam");
        students.put(2, "Adama");
        students.put(3, "Adamas");

        Map<Integer, String > otherstudents= new HashMap<>();
        students.putAll(students);
        System.out.println(students.isEmpty());
        System.out.println(students.size());
        System.out.println(students.containsKey(3));
        System.out.println(students.containsValue("Adam"));





    }


}

