package obiektowe.silnia;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner scanner = new Scanner(System.in);

        Silnia s = new Silnia();
        System.out.println("Podaj n: ");
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(i + "! = " + s.silnia(i));
        }
    }
}
