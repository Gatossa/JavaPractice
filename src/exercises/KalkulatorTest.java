package exercises;

import java.util.Scanner;

public class KalkulatorTest {
     public static void main(String[] args)
       {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę podaj pierwszą liczbę");
            int firstNumber = scanner.nextInt();
            System.out.println("Proszę podaj drugą liczbę");
            int secondNumber = scanner.nextInt();

            kalkulator Kalkulator=new kalkulator();

            int addition= Kalkulator.add(firstNumber, secondNumber);
            int substract = Kalkulator.sub(firstNumber, secondNumber);
            int multi = Kalkulator.mul(firstNumber, secondNumber);
            float division = Kalkulator.div(firstNumber, secondNumber);
            int mod = Kalkulator.mod(firstNumber, secondNumber);

            System.out.println("Wynik dodania " + addition);
            System.out.println("Wynik odejmowania " + substract);
            System.out.println("Wynik mnożenia " + multi);
            System.out.println("Wynik dzielenia " + division);
            System.out.println("Wynik modulo " + mod);

        }
    }





