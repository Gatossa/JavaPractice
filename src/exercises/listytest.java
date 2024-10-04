package exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listytest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Paweł");
        names.add("Kasia");
        names.add("Ala");
        names.add("Paweł");
        names.add("Kasia");
        names.add("Ala");
//        for (String name : names) {
//            System.out.println(name);
            for (String imie : names) {
                System.out.println(imie);

//
//            System.out.println(names.getFirst());
//            System.out.println(names.get(0));
//            System.out.println(names.indexOf("Ala"));
//            System.out.println(names.lastIndexOf("Ala"));
//            System.out.println(names.contains("Ola"));
//            System.out.println(names.contains("Ala"));
//            System.out.println(names.size());


                List<Integer> numbers = new LinkedList<>();
                numbers.add(1);
                numbers.add(6);
                numbers.add(71);
                numbers.add(5);
                numbers.add(6);
                numbers.add(71);
                numbers.add(5);


//            System.out.println(numbers.getFirst());
//            System.out.println(numbers.indexOf(1));
//            System.out.println(numbers.lastIndexOf(6));
//            System.out.println(numbers.contains(71));
//            System.out.println(numbers.contains(2));
//            System.out.println(numbers.size());


            }

        }
    }

