package spoj;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a; ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe b; ");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbe c; ");
        int c = scanner.nextInt();
        System.out.println("Podaj liczbe d; ");
        int d = scanner.nextInt();
        System.out.println("Input\n"+a+"\n"+b+"\n"+c+"\n"+d+"\n");
        int ab= a+b;
        int abc = ab+c;
        int abcd = abc + d;
        System.out.println("Output");
        System.out.println(a+"\n"+ab+"\n"+abc+"\n"+abcd);
    }
}
