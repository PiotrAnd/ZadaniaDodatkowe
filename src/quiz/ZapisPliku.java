package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class ZapisPliku {
    public static void main(String[] args) {

        try {
            FileWriter pisarz = new FileWriter("test.txt");
            pisarz.write("Witamy w pliku tekstowym!");
            pisarz.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
