package zadania4;

import java.util.Scanner;

public class Tablice13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Nazwisko zawiera "+ nazwisko.length()+ " znaków");
    }
}
