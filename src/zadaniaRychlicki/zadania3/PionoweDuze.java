package zadaniaRychlicki.zadania3;

public class PionoweDuze {
    public static void main(DemoString[] args) {
        char[] dane = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k'};
        pionowo(dane);
        rozstrzelanie(dane);
        wielka(dane);
        mala(dane);
        pierwszaMala(dane);
        wielkie2(dane);
        odwrotnaKolejnosc(dane);
        wspak(dane);


        }

    private static void wspak(char[] dane) {
        System.out.println();
        System.out.println(dane);
        for (int i = 0, j = dane.length-1; i<j; ++i,--j){
            char temp = dane[i];
            dane[i]= dane[j];
            dane[j]= temp;
        }
        System.out.println(dane);
    }

    private static void odwrotnaKolejnosc(char[] dane) {
        System.out.println();
        for (int i=dane.length-1; i >=0; --i )
            System.out.print(dane[i]);
    }

    private static void wielkie2(char[] dane) {
        int i;
        for (i = 0; i<dane.length; i++)
        dane[i] = Character.toUpperCase(dane[i]);
        System.out.print(dane);
    }

    private static void pierwszaMala(char[] dane) {
        System.out.println();
        dane[0] = Character.toLowerCase(dane[0]);
        System.out.println(dane);
    }

    private static void mala(char[] dane) {
        System.out.println();
        for (char znak : dane) {
            System.out.print(Character.toLowerCase(znak));
            System.out.print(" ");
        }
    }

    private static void wielka(char[] dane) {
        System.out.println();
        for (char znak : dane) {
            System.out.print(Character.toUpperCase(znak));
            System.out.print(" ");
        }
    }


    private static void rozstrzelanie(char[] dane) {
        for (char znak : dane) {
            System.out.print(znak);
            System.out.print(" ");

        }
    }

    private static void pionowo(char[] dane) {
        for (char znak : dane)
            System.out.println(znak);
        System.out.println();
    }
}
