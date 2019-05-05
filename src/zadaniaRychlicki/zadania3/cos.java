package zadaniaRychlicki.zadania3;

import java.util.Random;
import java.util.Scanner;

public class cos {
    public static void main(String[] args) {
        Random random = new Random();
        int losowana = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int podanaLiczba = scanner.nextInt();
        if (losowana==podanaLiczba)
        System.out.println("Trafileś");
        else
            System.out.println("Pudło");
    }
}


