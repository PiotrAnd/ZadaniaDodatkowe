package tablice;

public class TabliceDwuwymiarowe {
    public static void main(String[] args) {
        przekatna();
        przekatnaRosnaca();
        przekatnaOdwrotna();
        przekatnaRosnacaOdwrotna();
        dwaPierwszeIndeksy();
        przypisanieWartosciDoDrugiejTablicy();       dodawanieTablic();
        mnozenieTablic();
        sortowanieBabelkowe();

    }

    private static void sortowanieBabelkowe() {
        int[] tab = {574, 303, 34, 125, 8, 23};
        int i, j, x;
        System.out.println("SORTOWANIE BĄBELKOWE");

        for (i = 0; i < 6; i++) {
            if (i<=4)
                System.out.print(tab[i] + ", ");
            else
                System.out.print(tab[i] + ". ");
        }
        System.out.println();

        for (i = 0; i < 6; i++) {
            for (j = 5; j >0; j--) {
                if (tab[j - 1] > tab[j]) {
                    x = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = x;
                }
            }
            if (i<=4)
            System.out.print(tab[i] + ", ");
            else
                System.out.print(tab[i] + ". ");

            }
        }

    private static void mnozenieTablic() {
        int n = 10;
        int i,j;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        System.out.println("TABLICA A");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                a[i][j]=1;
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("TABLICA b");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                b[i][j]=2;
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Wynik mnożenia A i B");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

    }

    private static void odejmowanieTablic() {
        int n = 10;
        int i,j;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        System.out.println("TABLICA A");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                a[i][j]=1;
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("TABLICA b");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                b[i][j]=2;
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Wynik odejmowania A i B");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

    }

    private static void dodawanieTablic() {

        int n = 10;
        int i,j;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        System.out.println("TABLICA A");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                a[i][j]=1;
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("TABLICA b");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                b[i][j]=2;
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Wynik dodawania A i B");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

    }

    private static void przypisanieWartosciDoDrugiejTablicy() {
        int n = 10;
        int i;
        int j;
        int[][] tab = new int[n][n];
        int[][] tab2 = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                tab[i][j] = j;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Skopiowana tablica");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                tab2[j][i] = tab[j][i];
                System.out.print(tab2[j][i]+" ");
            }
            System.out.println();
        }
    }

    private static void dwaPierwszeIndeksy() {
        int n = 10;
        int i;
        int j;
        int suma;
        int[][] tab = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0) tab[i][j]=i;
                if (j == 1) tab[i][j]=i*i;
                if (j > 1) tab[i][j]=0;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;
        for (i = 0; i < n; i++) {
            suma = suma + tab[i][0];
        }
        System.out.println("Suma elementó w pierwszym indeksie tablicy wynosi: " +suma);

        suma = 0;
        for (i = 0; i < n; i++) {
            suma = suma + tab[i][1];
        }
        System.out.println("Suma elementó w  drugim indeksie tablicy wynosi: " +suma);

    }

    private static void przekatnaRosnacaOdwrotna() {
        int n = 10;
        int i;
        int j;
        int[][] tab = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (n== i+j+1) tab[i][j] = i;
                else tab[i][j] = 0;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (i = 0; i < n; i++) {
            suma = suma + tab[i][n-i-1];
        }
        System.out.println("Suma wyróżnionych elementó w tablicy wynosi: " +suma);
    }

    private static void przekatnaOdwrotna() {
        int n = 10;
        int i;
        int j;
        int[][] tab = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (n== i+j+1) tab[i][j] = 1;
                else tab[i][j] = 0;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (i = 0; i < n; i++) {
            suma = suma + tab[i][n-i-1];
        }
        System.out.println("Suma wyróżnionych elementó w tablicy wynosi: " +suma);
    }

    private static void przekatnaRosnaca() {
        int n = 10;
        int i;
        int j;
        int[][] tab = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) tab[i][j] = i;
                else tab[i][j] = 0;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (i = 0; i < n; i++) {
            suma = suma + tab[i][i];
        }
        System.out.println("Suma wyróżnionych elementó w tablicy wynosi: " +suma);
    }

    private static void przekatna() {
        int n = 10;
        int i;
        int j;
        int[][] tab = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) tab[i][j] = 1;
                else tab[i][j] = 0;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (i = 0; i < n; i++) {
            suma = suma + tab[i][i];
        }
        System.out.println("Suma wyróżnionych elementó w tablicy wynosi: " +suma);
    }
}
