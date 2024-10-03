package exercises;

public class Switch {
    public static void main(String[] args) {
        String dish = "Pizza";

        switch (dish){
            case "Pizza":
                System.out.println("Cena to 22 PLN");
                break;
            case "Łosoś":
                System.out.println("Cena to 42 PLN");
                break;
            case "Frytki":
                System.out.println("Cena to 12 PLN");
                break;
            default:
                System.out.println("Nie ma, idź gdzie indziej");
        }
    }

    private static class string {
    }
}
