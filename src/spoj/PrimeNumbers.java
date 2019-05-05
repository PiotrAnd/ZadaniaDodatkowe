package spoj;


import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = scanner.nextInt();
        if (n<2)
        return;

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("TAk");
        }
            else
            System.out.println("NIE");
            }
        }
