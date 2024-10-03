package exercises;

public class jamnik extends dog {

    public String digging;


    public jamnik(String breed, int age, int weight, String colour, String size, String digging) {
        super(breed, age, weight, colour, size);
        this.digging=digging;
    }

    public void problems() {
        System.out.println("I like being dirty");
        food();
        activity();


    }
}
