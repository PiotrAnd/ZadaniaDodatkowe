package zadania2;

import java.util.Scanner;

public class PierwiastkiZRownaniaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podja liczbę a: ");
        double a = sc.nextInt();
        double b ,c;

        char liczba_pierwiastkow = 0;

        if (a==0){
            System.out.println("Niedozwolona wartość współczynnika a.");
        }
        else{
            System.out.println("podaj liczbę b: ");
            b = sc.nextInt();
            System.out.println("Podaj liczbę c: ");
            c = sc.nextInt();
            double delta = b*b-4*a*c;

            if (delta < 0) liczba_pierwiastkow = 0;
            if (delta == 0) liczba_pierwiastkow = 1;
            if (delta > 0) liczba_pierwiastkow = 2;

            switch (liczba_pierwiastkow){

                case 0:
                    System.out.println("Brak pierwiastków rzeczywistych");
                    break;
                case 1 : {
                    double x1 = -b / 2 * a;
                    System.out.printf("Równanie kwadratowe ma jeden pierwiastek kwadratowy który wynosi: x1 = " + "%4.2f", x1);
                }
                    break;
                case 2 : {
                    double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Równanie kwadratowe ma dwa pierwiastki kwadratowe: x1 = " + "%4.2f", x1 + " x2 = " + "%4.2f", x2);
                }
                    break;
                }
            }
        }
    }
