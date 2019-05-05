package zadania2;

import java.util.Random;
import java.util.Scanner;

public class LosowanieLiczb {
    public static void main(String[] args) {
        Random losowana = new Random();
        int wylosowana = losowana.nextInt(9);
        System.out.println("Podaj liczbę z przedziału 0-9: ");
        Scanner sr = new Scanner(System.in);
        int podanaLiczna = sr.nextInt();

        if (wylosowana==podanaLiczna){
            System.out.println("Gratulacje");
        }
        else {
            System.out.println("Niestety nie trafileś. Wylosowana liczba to " + wylosowana);
        }


    }
}
