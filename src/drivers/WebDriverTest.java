package drivers;

public class WebDriverTest {

    public static void main(String[] args) {
        Chromedriver chrome=new Chromedriver();
        chrome.get();
        chrome.findElementBy();
        Firefoxdriver fox=new Firefoxdriver();
        fox.get();
        fox.findElementBy();
    }
}
