package spoj;

import java.util.Scanner;

public class ass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = scanner.nextInt();
        if (checkInputNumberIsCorrect(n)) return;
        printNumberSequence1(n);
        printNumberSequence2(n);
        printNumberSequence3(n);
        printNumberSequence4(n);
        printNumberSequence5(n);
        check(n);

    }

    private static void printNumberSequence5(int n) {
        int firsNumber = 0;
        int secondNumber = 1;
        for (int i = 2; i<=n;i++){
            System.out.println(firsNumber+" "+ secondNumber+" "+(firsNumber+secondNumber));
        }
    }

    private static void check(int n) {
        System.out.println();
        for (int i = 0; i <= n; i++)
            System.out.print(printNumberSequence4(i)+" ");
    }

    private static long printNumberSequence4(int n) {
        if (n <= 1)
            return n;
        else
            return printNumberSequence4(n - 1) + printNumberSequence4(n - 2);
    }

    private static void printNumberSequence3(int n) {
        System.out.println();
        for (int i = 1, result = 2, mnoznik = 1; i <= n; i++, result += 2 * mnoznik) {
            if (result == 8) {
                mnoznik = -1;
            }else if (result==2){
                mnoznik=1;
            }
            System.out.print(result + " ");
        }
        /*System.out.println();
        int[] numbers = {2, 4, 6, 8, 6, 4, 2};
        for (int i = 0; i<n;i++){
            System.out.print(numbers[i%6]+" ");
        }*/
        /*int multipier = 1;
        System.out.println("2 ");
        for (int i = 1, result = 4; i<n; i++, result+=2 * multipier){
            if (i%3==0) multipier *=-1;
            System.out.println(result + " ");
        }*/
    }

    private static void printNumberSequence2(int n) {
        System.out.println();
        for (int i=1, k = -1, j=1; i<=n; k+=j, i++){
            j*=2;
            System.out.print(k+" ");
        }
    }


    private static boolean checkInputNumberIsCorrect(int n) {
        if (n < 1 || n > 20) {
            System.out.println("Niepoprawna liczba"+ " ");
            return true;
        }
        return false;
    }

    private static void printNumberSequence1(int n) {
        for (int i = 1; i <= n; i++){
            System.out.print(i*2-1+" ");
            // for (int i = 1; i <=2*n; i+=2){

        }
    }

}

