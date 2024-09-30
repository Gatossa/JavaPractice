import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int substract = firstNumber - secondNumber;
        int multi = firstNumber * secondNumber;
        float division = (float) firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("Wynik dodania " + addition);
        System.out.println("Wynik odejmowania " + substract);
        System.out.println("Wynik mnożenia " + multi);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);

    }
}
