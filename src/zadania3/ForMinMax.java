package zadania3;

import java.util.Random;

public class ForMinMax {
    public static void main(String[] args) {
        Random random = new Random();
        int iloscLiczb = 5;
        int i;
        int suma;
        int min;
        int max;
        int liczba;

        min = random.nextInt(100);
        System.out.println("wylosowane liczby: " + min);
        max = min;
        suma=+ min;


        for (i=1; i<iloscLiczb;i++){
            liczba = random.nextInt(100);
            System.out.println(liczba + ", ");

            if (max<liczba)
                max = liczba;
            if (liczba < min)
                min = liczba;

            suma += liczba;

        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);

    }
}
