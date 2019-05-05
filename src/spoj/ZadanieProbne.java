package spoj;

import java.util.Scanner;

public class ZadanieProbne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe A; ");
        int A = scanner.nextInt();
        System.out.println("Podaj liczbe B; ");
        int B = scanner.nextInt();
        System.out.println("Input:\n" +A +"\n"+B );
        System.out.println("Output\n"+(A+B));
    }
}
