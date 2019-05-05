package petle;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        rownanie();
        wyswieltaLiczby();
        sumowanieLiczb();
        sumowanieLiczbParzystych();
        sumownielIczbNieparzystych();
        wartoscMinMax();
        tabliczkaMnozenia();
        alfabet();
    }

    private static void alfabet() {
        char znak;
        znak = 'A';
        do {
            if (znak < 'Z')
            System.out.print(znak + ", ");
            else
            System.out.print(znak+".");
            znak++;
        }
        while (znak <='Z');
        System.out.println();
        znak = 'Z';
        do {
            if (znak > 'A')
                System.out.print(znak + ", ");
            else
                System.out.print(znak+".");
            znak--;
        }
        while (znak >='A');

        }


    private static void tabliczkaMnozenia() {
        int kolumna;
        int wiersz = 1;
        do {
            kolumna = 1;
            do {
                System.out.print(kolumna * wiersz + "\t");
                kolumna++;
            }
            while (kolumna <= 10);
            wiersz++;
            System.out.println();
        }
        while (wiersz <= 10) ;

    }

    private static void wartoscMinMax() {
        int i=1;
        int suma = 0;
        int max = 0;
        int min = 100;
        int liczba;
        Random random = new Random();
        do {
            liczba= random.nextInt(100);
            System.out.print(liczba + " ");
            if (max<liczba)max=liczba;
            if (min>liczba) min=liczba;
            suma += liczba;
            i++;
        }
        while (i<=5);
        System.out.println();
        System.out.println("Najwieksza wylosowana liczba: "+max);
        System.out.println("Najmniejsza wylosowana liczba: " +min);
        System.out.println("Srednia wartośc wylosowanych liczb wynosi: "+suma/5);
    }

    private static void sumownielIczbNieparzystych() {
        int i = 1;
        int suma = 0;
        do {
            if (i%2!=0){
                suma +=i;
            }
            i++;
        }
        while (i<=100);
        System.out.println("Suma liczb nieparzystych wynosi: "+suma);
    }

    private static void sumowanieLiczbParzystych() {
        int i = 1;
        int suma = 0;
        do {
            if (i%2==0){
                suma +=i;
            }
            i++;
        }
        while (i<=100);
        System.out.println("Suma liczb parzystych wynosi: "+suma);
    }

    private static void sumowanieLiczb() {
        int i = 1;
        int suma = 0;
        do {
            suma +=i;
            i++;
        }
        while (i<=100);
        System.out.println("Suma licz od 1 do 100 wynosi: "+ suma);
    }

    private static void wyswieltaLiczby() {
        int i=1;
        System.out.println("Wyświetla liczby od 1 do 20 - pętla do while");
        do {
            if (i<20)
                System.out.print(i+", ");
            else
                System.out.print(i+".");
            i++;
        }
        while (i<=20);
        System.out.println();
    }

    private static void rownanie() {
            int x=0;
            int y =0;
            do {
                y = 3*x;
                System.out.println("3 * "+x +" = "+ y);
                x++;
            }
            while (x<=10);
        }
        }

