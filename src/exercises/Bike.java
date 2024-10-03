package exercises;

public class Bike implements Vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z prędkościa " + speed);}

    @Override
    public void stop( ) {
        System.out.println("Hamuję rowerem");}

    }


