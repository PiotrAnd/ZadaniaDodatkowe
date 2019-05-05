package Lis;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        liczbyPierwsze();
    }

    private static void liczbyPierwsze() {
        int liczba;
        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();
        if (liczba<2) {
            System.out.println("Nieprawidłowa liczba");
            return;
        }

        for (int i = 2; i <= liczba; i++) {
            for (int j = 2; j <= i; j++) {
                if ( j== i) {
                    System.out.println(i);
                }
                if (i%j==0){
                    break;
                }
            }
        }
    }
}
