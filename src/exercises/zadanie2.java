package exercises;

import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swój wiek");
        int wiek = scanner.nextInt();
        if (wiek < 18 && wiek >= 0) {
            System.out.println("Nie mozesz kupić alkoholu");
        } else if (wiek < 0) {
            System.out.println("Wprowadź poprawną wartość");
        } else {
            System.out.println("Chlej do woli");
        }
    }
}

