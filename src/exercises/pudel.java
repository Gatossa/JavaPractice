package exercises;

public class pudel extends dog {

    public String intelligence;

    public pudel(String breed, int age, int weight, String colour, String size, String intelligence) {
        super(breed, age, weight, colour, size);
        this.intelligence=intelligence;

    }

    public void training() {
        System.out.println("I like being trained");

        food();
        activity();




    }
}




