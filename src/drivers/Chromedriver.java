package drivers;

public class Chromedriver implements Webdriver{
    @Override
    public void findElementBy() {
        System.out.println("Otwieram Chrome"); ;

    }

    @Override
    public void get() {
        System.out.println("Znajduję element w Chrome");

    }
}
