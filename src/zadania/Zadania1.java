package zadania;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.IOException;
import java.util.Scanner;

import static com.sun.org.apache.xerces.internal.impl.xpath.regex.Match.*;

public class Zadania1 {
    public static void main(String[] args) throws IOException {
        poleprostokąta();
        pi();
        kwadratPI();
        objetoscKuli();
        dzielenie();
        dzieleniereszta();
        wyniki();

    }

    private static void wyniki() {
        float x;
        float y;
        float suma;
        float roznica;
        float iloczyn;
        float iloraz;
        Scanner sr = new Scanner(System.in);
        System.out.println("Podaj liczbę x: ");
        x = sr.nextFloat();
        System.out.println("Podaj liczbę y: ");
        y = sr.nextFloat();
        suma = x+y;
        roznica = x-y;
        iloczyn = x*y;
        iloraz = x/y;
        System.out.println("Suma wynosi: " + suma);
        System.out.println("Różnica wynosi: " + roznica);
        System.out.println("Iloczyn wynosi: " + iloczyn);
        System.out.println("Iloraz wynosi: " + iloraz);
    }

    private static void dzieleniereszta() {
        int a = 37;
        int b = 11;
        int wynik = a%b;
        System.out.println("Wynik dzielenie z reszta wynosi: " + a + "%" + b+"="+wynik);
    }

    private static void dzielenie() {
        int a = 37;
        int b = 11;
        int wynik = a/b;
        System.out.println("Wynik dzielenie bez reszty wynosi: " + a + "/" + b+"="+wynik);
    }

    private static void objetoscKuli() throws IOException {
        Scanner sr = new Scanner(System.in);
        System.out.println("Obliczanie objętości kuli.");
        System.out.println("Podaj długość promienia r.");
        double r = sr.nextDouble();
        double objetosc = 4*Math.PI*r*r*r/3;
        double pi = Math.PI;
        System.out.printf("%2.2f\n", objetosc);

    }

    private static void kwadratPI() {
        System.out.println();
    }

    private static void pi() throws IOException {
        System.out.println("Program wyświetla liczbę PI z zadaną dokładnością.");
        System.out.printf("PI = " + "%6.5f\n",Math.PI);
    }

    private static void poleprostokąta() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Program oblicza pole prostokąta.");
        System.out.println("Podaj dlugośc boku a.");
        double a = sr.nextDouble();
        System.out.println("Podaj długość boku b.");
        double b = sr.nextDouble();
        double pole = a*b;
        System.out.println("Pole prostokąta wynosi: " + pole);
    }
}
