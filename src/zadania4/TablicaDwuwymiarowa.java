package zadania4;

public class TablicaDwuwymiarowa {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        for (int i =0; i<10; i++){
            for (int j=9; j>=0;j--){
                if (i==j)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        }
    }
