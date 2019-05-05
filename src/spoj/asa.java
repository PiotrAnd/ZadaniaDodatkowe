package spoj;

public class asa {
    public static void main(String[] args) {
        wizytowka();
        tablicaChar();

    }

    private static void tablicaChar() {
        char[] nazwa={'W', 'I', 'T', 'A', 'J'};
        System.out.println(nazwa);
        System.out.println(nazwa+"\n");
    }

    private static void wizytowka() {
        for (int i =0; i<=20;i++) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.println("* Imię: Piotr                           *");
        System.out.println("* Nazwisko: Andrzejuk                   *");
        System.out.println("* Adres: Białystok, ul. Merkurego 3A    *");
        System.out.println("* Adres email: cortezzz@o2.pl           *");

        for (int i =0; i<=20;i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
