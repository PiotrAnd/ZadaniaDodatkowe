package petle;

import java.util.Random;

public class While {
    public static void main(String[] args) {
        rownanie();
        wyswietlenieLiczb();
        sumowanieLiczb();
        sumowanieLiczbParzystych();
        sumowanieLiczbNieparzystych();
        wartoscMinMax();
        tabliczkaMnozenia();
        
    }

    private static void tabliczkaMnozenia() {
        int kolumna;
        int wiersz;
        kolumna = 1;
        while (kolumna<=10){
        wiersz = 1;
        while (wiersz<=10) {
            System.out.print(kolumna * wiersz + "\t");
            wiersz++;
            }
            kolumna++;
            System.out.println();
        }
    }

    private static void wartoscMinMax() {
        int i = 1;
        int suma = 0;
        int max = 0;
        int min = 100;
        int liczba;
        Random random = new Random();
        while (i<=5){
            liczba= random.nextInt(100);
            System.out.print(liczba + " ");
            if (max<liczba)max=liczba;
            if (min>liczba) min=liczba;
            suma += liczba;
            i++;
        }
        System.out.println();
        System.out.println("Najwieksza wylosowana liczba: "+max);
        System.out.println("Najmniejsza wylosowana liczba: " +min);
        System.out.println("Srednia wartośc wylosowanych liczb wynosi: "+suma/5);
    }

    private static void sumowanieLiczbNieparzystych() {
        int i = 1;
        int suma = 0;
        while (i<=100){
            if (i%2!=0)
                suma +=i;
            i++;
        }
        System.out.println("Suma liczb nieparzystych wynosi: "+suma);
    }

    private static void sumowanieLiczbParzystych() {
        int i = 1;
        int suma = 0;
        while (i<=100){
            if (i%2==0)
                suma +=i;
            i++;
        }
        System.out.println("Suma liczb parzystych wynosi: "+suma);
    }

    private static void sumowanieLiczb() {
        int i= 1;
        int suma = 0;
        while (i<=100){
            suma+=i;
            i++;
        }
        System.out.println("Suma licz od 1 do 100 wynosi: "+ suma);
    }

    private static void wyswietlenieLiczb() {
        int i = 1;
        System.out.println("Wyświetla liczby od 1 do 20 - pętla while");
        while (i<=20){
            if (i<20)
                System.out.print(i+", ");
            else
                System.out.print(i+".");
            i++;
        }
        System.out.println();
    }

    private static void rownanie() {
        int x = 0;
        int y = 0;
        while (x<=10){
            y=3*x;
            System.out.println("3 * "+x +" = "+ y);
            x++;
        }
    }
}




