package obiektowe.silnia;

public class Silnia {
    public long silnia(int liczba){
        long zwrot = 1;
        if (liczba>=2){
            zwrot = liczba * silnia(liczba-1);
        }
        return zwrot;
    }
}
