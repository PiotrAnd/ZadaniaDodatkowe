package obiektowe.tablice;

import java.util.Random;

public class Tablice {
    public void czytajDane(int[][] tab, int rozmiar) {
        int i, j;
        Random random = new Random();
        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                if (i == j)
                    tab[i][j] = random.nextInt(9);
                else
                    tab[i][j] = 0;
            }
        }
    }

    public void przetworzDane(int[][] tab, int rozmiar) {
        int i;
        int suma = 0;
        for (i = 0; i < rozmiar; i++)
            suma = suma + tab[i][i];
        System.out.println("Suma wynosi: " + suma);
    }

    public void wyswietlWynik(int[][] tab, int rozmiar) {
        int i, j;
        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }

    }
}
