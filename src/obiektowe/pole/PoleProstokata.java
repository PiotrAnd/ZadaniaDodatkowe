package obiektowe.pole;

import java.io.IOException;
import java.util.Scanner;

class PoleProstokata  {
    double a;
    double b;
    double pole;

    public void czytajdane() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugość boku a: ");
        a = scanner.nextDouble();
        System.out.println("Podaj dlugość boku b: ");
        b = scanner.nextDouble();
    }

    public void obliczPole() {
        pole = a * b;
    }

    public void wyswietlWynik() {
        System.out.println("Pole prostokąta o boku a = " + a + " i boku b = " + b + " wynosi " + pole);
    }
}


