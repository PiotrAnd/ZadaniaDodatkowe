package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class OdczytPliku {
    public static void main(String[] args) {
        try {
            File mojPlik = new File("D:\\Java\\zadaniaKubiak\\tekst.txt");
            FileReader czytelnikF = new FileReader(mojPlik);
            BufferedReader czytelnik = new BufferedReader(czytelnikF);
            String wiersz = null;
            while ((wiersz = czytelnik.readLine())!=null){
                System.out.println(wiersz);
            }
            czytelnik.close();
        }catch (Exception zd){
            zd.printStackTrace();
        }
    }
}
