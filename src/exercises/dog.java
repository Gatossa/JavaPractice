package exercises;

public class dog {

    public String breed;
    public int age;
    public int weight;
    public String colour;
    public String size;

    public dog(String breed, int age, int weight, String colour, String size) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.size = size;
    }

    public void food() {
        System.out.println("I like chicken");
    }
    public void activity() {
        System.out.println("I like running");
    }
}

