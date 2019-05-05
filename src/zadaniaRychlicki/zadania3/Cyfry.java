package zadaniaRychlicki.zadania3;

public class Cyfry {
    public static void main(String[] args) {
        String cyfry = "";
        for (int i =0; i<16; i++)
            cyfry += Character.forDigit(i, 16);
        System.out.println(cyfry);
    }
}
