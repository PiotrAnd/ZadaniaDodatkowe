package Allen;

import java.util.Arrays;
import java.util.Scanner;

public class Losowanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb wylosować: ");
        int k = scanner.nextInt();
        System.out.println("Jaka jest największa liczba: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }

        System.out.println();
        int[] podaneLiczby = new int[6];
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
        System.out.println("Podane liczby");
        for (int i = 0; i < 6; i++) {
            Arrays.sort(podaneLiczby);
            if (i < 5) {
                System.out.print(podaneLiczby[i] + ", ");
            } else
                System.out.println(podaneLiczby[i] + ".");
        }

        System.out.println();
        Arrays.sort(result);
        System.out.println("Wylosowane liczby: ");
        for (int r : result) {
            System.out.print(r + ", ");

        }
        System.out.println();
        int trafioneLiczby = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < podaneLiczby.length; j++) {
                if (result[i] == podaneLiczby[j]) {
                    trafioneLiczby++;
                }
            }
        }
        if (trafioneLiczby ==0)
            System.out.println("Nie trafileś żadnej liczby.");
        if (trafioneLiczby ==1)
            System.out.println("Trafileś jedną liczbę.");
        if (trafioneLiczby ==2)
            System.out.println("Trafileś dwie liczby.");
        if (trafioneLiczby ==3)
            System.out.println("Trafileś trzy liczby.");
        if (trafioneLiczby ==4)
            System.out.println("Trafileś cztery liczby.");
        if (trafioneLiczby ==5)
            System.out.println("Trafileś pięć liczb.");
        if (trafioneLiczby ==6)
            System.out.println("Trafileś sześć liczb.");

    }
}
