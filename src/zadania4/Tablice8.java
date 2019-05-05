package zadania4;

public class Tablice8 {
    public static void main(String[] args) {
        int n = 10;
        int[][] tabA = new int[n][n];
        int[][] tabB = new int[n][n];
        for (int i = 0; i<tabA.length; i++){
            for (int j = 0; j<tabA.length; j++){
                tabA[i][j]= j;
                System.out.print(j+" ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Zawartość tablicy B");
        System.out.println();
        for (int i = 0; i<tabB.length; i++){
            for (int j = 0; j<tabB.length; j++){
                tabB[i][j]=tabA[j][i] ;
                System.out.print(tabB[i][j]+" ");
            }
            System.out.println();
        }

    }
}
