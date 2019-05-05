package zadaniaRychlicki.zadania3;

public class DemoString {
    public static void main(String[] args) {

        String napis = "Podstawy z programowania";
        System.out.println("Drukuje pierwsza literę: " +napis.charAt(0));
        System.out.println("Drukuje dlugośc napisu: " + napis.length());
        System.out.println(napis.length()-1);
        System.out.println(napis.toUpperCase());
        System.out.println(napis.toLowerCase());
        System.out.println(napis.indexOf("z"));
        System.out.println(napis.substring(0,8));
        String witaj = "Dzień dobry";
        for (int i = 0; i <witaj.length(); i++)
            System.out.println(witaj.charAt(i));
        System.out.println();
        System.out.println("Tekst rozstrzelony");
        for (int i = 0; i <witaj.length(); i++)
            System.out.print(witaj.charAt(i)+" ");
        System.out.println();
        System.out.print("Wielkie litery: " + witaj.toUpperCase());
        System.out.println();
        System.out.print("Małe litery: " + witaj.toLowerCase());
        System.out.println();
        String napis1 = "programowanie";
        napis1 = Character.toUpperCase(napis1.charAt(0))+napis1.substring(1);
        System.out.println(napis1);
        System.out.println(napis1.toUpperCase());
        for (int i = napis1.length()-1; i>=0;i--)
            System.out.print(napis1.charAt(i));
    }
}
