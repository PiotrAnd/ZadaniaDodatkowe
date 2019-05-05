package Allen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        int[] podaneLiczby = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        podaneLiczby[0] = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        podaneLiczby[1] = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        podaneLiczby[2] = scanner.nextInt();
        System.out.println("Podaj czwartą liczbę: ");
        podaneLiczby[3] = scanner.nextInt();
        System.out.println("Podaj piątą liczbę: ");
        podaneLiczby[4] = scanner.nextInt();
        System.out.println("Podaj szóstą liczbę: ");
        podaneLiczby[5] = scanner.nextInt();
        for (int i = 0; i < 6; i++) {
            System.out.print(podaneLiczby[i] + " ");
        }
        System.out.println();

        int[] wylosowaneLiczby = new int[6];
        Random random = new Random();
        for (int j = 0; j < wylosowaneLiczby.length; j++) {
            int r = random.nextInt(6) + 1;
            wylosowaneLiczby[j] = podaneLiczby[r];
            podaneLiczby[r] = podaneLiczby[r-1];
            r--;
        }
        System.out.println();
        Arrays.sort(wylosowaneLiczby);
        for (int r : wylosowaneLiczby)
            System.out.print(r+", ");

        int trafioneLiczby = 0;
        for (int i = 0; i < wylosowaneLiczby.length; i++) {
            for (int j = 0; j < podaneLiczby.length; j++) {
                if (wylosowaneLiczby[i] == podaneLiczby[j]) {
                    System.out.println("Trafiona liczba!: " + wylosowaneLiczby[i]);
                    trafioneLiczby++;

                }
            }
        }
    }}
