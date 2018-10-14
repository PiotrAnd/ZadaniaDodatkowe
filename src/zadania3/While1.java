package zadania3;

public class While1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x <= 10) {
            y = 3 * x;
            System.out.println("x = " + x + "\t" + "y = " + y);
            x++;
        }
    }
}
