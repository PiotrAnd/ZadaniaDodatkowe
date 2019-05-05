package kursYT.javaOdPodstaw;

public class zadanie3 {
    public static void main(String[] args) {
        triangle();
        System.out.println();
        tablicaZnakow();
        System.out.println();
        alfabet();
        System.out.println();
        System.out.println();
        wyswietlenieTablicy();
    }

    private static void triangle() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i >= j)
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void tablicaZnakow() {
        int[][] tab = new int[][]{new int[5], new int[3], new int[7]};

        int i;
        int j;
        for (i = 0; i < tab.length; ++i) {
            for (j = 0; j < tab[i].length; ++j) {
                tab[i][j] = 1;
            }
        }

        for (i = 0; i < tab.length; ++i) {
            for (j = 0; j < tab[i].length; ++j) {
                System.out.print(tab[i][j]);
            }

            System.out.println("");
        }

    }

    private static void alfabet() {
        char a = 'a';
        while (a <= 'z')
            System.out.print(a++ + " ");
    }

    private static void wyswietlenieTablicy() {
        int[] tab = new int[10];
        int i = 0;

        for (int j = 11; i < tab.length; ++i) {
            tab[i] = j;
            j += 11;
            System.out.println(i+" "+tab[i]);
        }

    }
}
