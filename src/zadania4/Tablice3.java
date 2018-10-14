package zadania4;

public class Tablice3 {
    public static void main(String[] args) {
        int n = 10;
        int i;
        int j;
        int[][] tab = new int[n][n];
        int suma;
        for ( i = 0; i < tab.length; i++) {
            for ( j = 0; j < tab.length; j++) {
                if (j == 0) tab[i][j] = i;
                if (j == 1) tab[i][j] = i * i;
                if (j > 1) tab[i][j] = 0;
            }

            }
            for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();


        }
    }
}
