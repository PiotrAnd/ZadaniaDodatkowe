package zadania;

public class Triangle {
    public static void main(String[] args) {
        triangleLeftDown();
        System.out.println();
        triangleLeftUP();
        trianglerightDown();
        trianglerightUp();


    }

    private static void trianglerightUp() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void trianglerightDown() {
        int n = 10;
        for (int i = 0; i<n; i++){
            for (int j = n-1; j>=0; j--){
                if (i<j)
                    System.out.printf(" ");
                else
                    System.out.printf("*");
            }
            System.out.println(" ");
        }
    }

    private static void triangleLeftUP() {
        int n = 10;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (i<j)
                    System.out.printf("*");
            }
            System.out.println("");
        }
    }

    private static void triangleLeftDown() {
        int n = 10;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (i>j)
                    System.out.printf("*");
            }
            System.out.println("");
        }
    }

}
