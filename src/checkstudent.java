import java.util.Scanner;

public class checkstudent {
    public static void main(String[] args) {
        student adam= new student();
        adam.imie= "Adam";
        adam.nazwisko= "Kowalski";
        adam.email= "adam@wp.pl";
        adam.index= 1234;


        student kasia= new student();
        kasia.imie= "Kasia";
        kasia.nazwisko= "Lot";
        kasia.email= "kasia@wp.pl";
        kasia.index= 12;

        student ala= new student();
        ala.imie= "Aleksandra";
        ala.nazwisko= "Lotka";
        ala.email= "ala@wp.pl";
        ala.index= 127;

        student[]  Students= new student[3];
         Students[0]=adam;
         Students[1]=kasia;
         Students[2]=ala;

        for (student student : Students) {
            student.przedstawsie();
            student.podajmaila();
            student.podajindex();


            String plec;
            Scanner dom;

        }

    }
}
