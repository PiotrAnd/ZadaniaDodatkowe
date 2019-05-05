package zadania4;

public class Tablica10 {
    public static void main(String[] args) {
        int n = 10;
        int i;
        int j;
        int[][] tabA = new int[n][n];
        int[][] tabB = new int[n][n];
        int[][] tabC = new int[n][n];

        System.out.println("Tablica A");

        for (i=0;i<tabA.length; i++){
            for (j =0; j<tabA.length; j++){
                tabA[i][j]=1;

                System.out.print(tabA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Tablica B");
        for (i=0;i<tabB.length; i++){
            for (j =0; j<tabB.length; j++){
                tabB[i][j]=2;

                System.out.print(tabB[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Suma tablicy A i B");
        for (i=0;i<tabC.length; i++){
            for (j =0; j<tabC.length; j++){
                tabC[i][j]=tabA[i][j]-tabB[i][j];

                System.out.print(tabC[i][j]+" ");
            }
            System.out.println();
        }
    }
}

