package spoj;

import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby odzielone spacją: ");
        String[] strings = scanner.nextLine().split(" ");
        System.out.println("Input");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println("\nOutput");
        for (int i = strings.length-1; i>=0;i--){
            System.out.print(strings[i]+" ");
        }
    }
}
