package zadania3;

public class ForTabliczkaMnozenia {
    public static void main(String[] args) {
        int n = 10;
        int wiersz;
        int kolumna;
        for (wiersz = 1; wiersz<=n; wiersz++) {
            for (kolumna = 1; kolumna <= n; kolumna++) {
                System.out.print(kolumna * wiersz + "\t");
            }
            System.out.println();
        }

    }
}
