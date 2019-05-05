package zadania4;

public class Tablice12 {
    public static void main(String[] args) {
        int[] tab = {4, 3, 2, 1, 5};
        int i;
        int j;
        int x;

        for (i = 0; i <= 4; i++) {
            if (i <= 3)
                System.out.print(tab[i] + ", ");
            else
                System.out.print(tab[i] + ".");
        }
        for (i = 0; i <= 4; i++) {
            for (j = 4; j > 0; j--)
                if (tab[j - 1] > tab[j]) {
                    x = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = x;
                }
        }
        System.out.println();
        for (i = 0; i <= 4; i++) {
            if (i <= 3)
                System.out.print(tab[i] + ", ");
            else
                System.out.print(tab[i] + ".");

        }

    }
}
