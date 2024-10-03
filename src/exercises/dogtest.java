package exercises;

public class dogtest {

    public static void main(String[] args) {
        pudel Pudel = new pudel
                ("Pudel", 3, 7, "black", "small", "high");
        Pudel.activity();
        Pudel.food();

        jamnik Jama = new jamnik
                ("Jamnik", 2, 8, "brown", "small", "like very much");
        Jama.problems();

        System.out.println("Jestem wesoły");

    }
}





