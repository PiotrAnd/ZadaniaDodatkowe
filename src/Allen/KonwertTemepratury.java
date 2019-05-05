package Allen;

import java.util.Scanner;

public class KonwertTemepratury {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartośc temeratury wyrażonej w stopniach C: ");
        double temperaturaC = scanner.nextDouble();
        double konwertNaF = ((temperaturaC * 9) / 5) + 32;
        System.out.println("Wartość temepratury w stopniach C= " + temperaturaC);
        System.out.println("Wartość temeperatury w sropniach F= "+konwertNaF);
    }
}
