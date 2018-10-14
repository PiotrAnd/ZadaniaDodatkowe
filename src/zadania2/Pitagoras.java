package zadania2;

import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podja liczbę a: ");
        int a = sc.nextInt();
        System.out.println("podaj liczbę b: ");
        int b = sc.nextInt();
        System.out.println("Podaj liczbę c: ");
        int c = sc.nextInt();

        if ((a*a+b*b)==c*c){
            System.out.println("Boki o długości a= "+ a + " b= "+b+" c= "+c+" tworzą trójkąt prostokątny");
        }
        else {
            System.out.println("Podane boki nie tworzą trójkąta prostokątnego");
        }
    }
}
