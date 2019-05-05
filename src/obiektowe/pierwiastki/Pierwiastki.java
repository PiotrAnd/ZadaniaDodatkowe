package obiektowe.pierwiastki;

import java.util.Scanner;

public class Pierwiastki {
    int a, b, c, x1, x2;
    char liczbaPierwiastkow;
    double delta;

    public void podajDane(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = scanner.nextInt();
        if (a==0){
        System.out.println("Zły parametr");
        System.exit(-1);
        }
        else {
            System.out.println("Podaj parametr b");
            b = scanner.nextInt();
            System.out.println("Podaj parametr c");
            c = scanner.nextInt();
        }
    }
    public void przetworzDane(){
        delta = b*b-4*a*c;
        if (delta < 0) liczbaPierwiastkow = 0;
        if (delta == 0) liczbaPierwiastkow = 1;
        if (delta > 0) liczbaPierwiastkow = 2;
        switch (liczbaPierwiastkow){
            case 1: x1=-b/(2*a);
            break;
            case 2: {
                x1 = (int) ((-b-Math.sqrt(delta))/(2*a));
                x2 = (int) ((-b+Math.sqrt(delta))/(2*a));
            }
            break;
        }
    }
    public void wyswietlWynik(){
        System.out.println("Dla wprowadzonych liczb");

        switch (liczbaPierwiastkow){
            case 0:
                System.out.println("brak pierwiastków rzeczywistych");
                break;
            case 1:
                System.out.println("Jeden pierwiastek " + x1);
                break;
            case 2:
                System.out.println("Dwa pierwiastki " + x1+ " i " + x2);
                break;
        }

    }

}
