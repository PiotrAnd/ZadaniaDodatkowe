package petle;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class For {
    public static void main(String[] args) {
        rownanie();
        wyswietlaLiczby();
        sumowanieLiczb();
        sumowanieLiczbParzystych();
        sumowanieLiczbNieparzystych();
        wartoscMinMax();
        tabliczkaMnozenia();
        alfabet();

    }

    private static void alfabet() {
        char znak;
        for (znak = 'A'; znak <= 'Z'; znak++) {
            if (znak < 'Z')
            System.out.print(znak + ", ");
            else
                System.out.print(znak+".");
        }
        System.out.println();
        for (znak = 'Z'; znak >= 'A'; znak--){
            if (znak>'A')
            System.out.print(znak + ", ");
            else
                System.out.print(znak + ".");
        }
        System.out.println();
    }


    private static void tabliczkaMnozenia() {
        int kolumna;
        int wiersz;
        for (kolumna = 1; kolumna<=10; kolumna++){
            for (wiersz=1; wiersz<=10; wiersz++){
                System.out.print(kolumna*wiersz+"\t");
            }
            System.out.println();
        }
    }

    private static void wartoscMinMax() {
        int suma = 0;
        int max = 0;
        int min = 100;
        int liczba;
        Random random = new Random();
        System.out.println("Wylosowane liczby: ");
        for (int i =1; i<=5;i++){
            liczba= random.nextInt(100);
            System.out.print(liczba + " ");
           if (max<liczba)max=liczba;
           if (min>liczba) min=liczba;
           suma += liczba;

        }
        System.out.println();
        System.out.println("Najwieksza wylosowana liczba: "+max);
        System.out.println("Najmniejsza wylosowana liczba: " +min);
        System.out.println("Srednia wartośc wylosowanych liczb wynosi: "+suma/5);


    }

    private static void sumowanieLiczbNieparzystych() {
        int suma = 0;
        for (int i = 1; i<=100; i++){
            if (i%2!=0)
                suma +=i;
        }
        System.out.println("Suma liczb nieparzystych wynosi: "+suma);
    }

    private static void sumowanieLiczbParzystych() {
        int suma = 0;
        for (int i = 1; i<=100; i++){
            if (i%2==0) {
                suma += i;
            }
        }
        System.out.println("Suma liczb parzystych wynosi: "+suma);
    }

    private static void sumowanieLiczb() {
        int suma = 0;
        for (int i=1; i<=100;i++){
            suma += i;
        }
        System.out.println("Suma licz od 1 do 100 wynosi: "+ suma);

    }

    private static void wyswietlaLiczby() {
        int i;
        System.out.println("Wyświetla liczby od 1 do 20");
        for (i = 1; i <= 20; i++) {
            if (i < 20)
                System.out.print(i+", ");
            else
                System.out.print(i+".");
        }
        System.out.println();
    }

    private static void rownanie() {
        int x;
        int y;
        for (x = 0; x<=10; x++){
            y = 3*x;
            System.out.println("Wynik równania y= 3x dla x = "+x +" = "+ y);
        }
    }
}
