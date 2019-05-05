package tablice;

public class TablicaJednowymiarowa {
    public static void main(String[] args) {
        doGory();
        doDolu();

    }

    private static void doDolu() {
        int n = 10;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = n-1-i;
            System.out.println("[" + i + "]" + tab[i]);
        }
    }

    private static void doGory() {
        int n = 10;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = i;
            System.out.println("[" + i + "]" + tab[i]);
        }
        System.out.println();
    }
}
