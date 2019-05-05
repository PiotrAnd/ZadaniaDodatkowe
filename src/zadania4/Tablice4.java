package zadania4;

public class Tablice4 {
    public static void main(String[] args) {
        int n = 10;
        int[][] macierz = new int[n][n];
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i == j)
                    macierz[i][j] = i;
                else
                    macierz[i][j] = 0;
            }
        }
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (i = 0; i < 10; i++){
            suma=suma+macierz[i][i];
        }
        System.out.println(suma);


    }
}