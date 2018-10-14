package zadania2;

import java.util.Scanner;

public class PierwiasetZRownania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podja liczbę a: ");
        int a = sc.nextInt();
        System.out.println("podaj liczbę b: ");
        int b = sc.nextInt();
        System.out.println("Podaj liczbę c: ");
        int c = sc.nextInt();
        double delta = b*b-4*a*c;

        if (delta ==0){
            double x1= -b/2*a;
            System.out.printf("Równanie kwadratowe ma jeden pierwiastek kwadratowy który wynosi: x1 = "+"%4.2f",x1);
            }
            else{
                if (delta >0){
                    double x1 = (-b-Math.sqrt(delta))/(2*a);
                    double x2 = (-b+Math.sqrt(delta))/(2*a);
                    System.out.printf("Równanie kwadratowe ma dwa pierwiastki kwadratowe: x1 = "+"%4.2f",x1 +" x2 = " +"%4.2f",x2);
                    }
                    else{
                        if (delta<0){
                            System.out.println("Brak pierwaistków");
                        }
                }
        }



    }
}
