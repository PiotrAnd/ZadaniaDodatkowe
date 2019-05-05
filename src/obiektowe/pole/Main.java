package obiektowe.pole;


import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {
            PoleProstokata pole = new PoleProstokata();
            pole.czytajdane();
            pole.obliczPole();
            pole.wyswietlWynik();

        }
    }
