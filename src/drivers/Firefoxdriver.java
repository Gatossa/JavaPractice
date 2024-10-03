package drivers;

public class Firefoxdriver implements Webdriver{
    @Override
    public void get() {
        System.out.println("Otwieram Fox");}
    @Override
    public void findElementBy() {System.out.println("Znajduję element w Fox");}
}
