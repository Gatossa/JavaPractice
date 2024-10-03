package exercises;

public class AutoTest {

    public static void main(String[] args) {
        Auto Mercedes=new Auto("Mercedes", "klasa S", 2011, 12000);
        Mercedes.jedz();
        Mercedes.hamuj();
        Mercedes.info();
        Auto Audi=new Auto("Audi", "A5", 2020, 3000);
        Audi.info();
        Auto Citroen=new Auto("Citroen", "C4", 2017, 60000);
        Citroen.info();




    }
}
