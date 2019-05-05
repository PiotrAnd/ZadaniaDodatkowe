package obiektowe.tablice;

public class Main {
    public static void main(String[] args) {
        int rozmiar = 10;
        int [][]tab2 = new int[rozmiar][rozmiar];

        Tablice tablice1 = new Tablice();
        tablice1.czytajDane(tab2, rozmiar);
        tablice1.przetworzDane(tab2, rozmiar);
        tablice1.wyswietlWynik(tab2, rozmiar);
    }
}
