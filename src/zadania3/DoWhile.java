package zadania3;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i<20)
            System.out.printf(i + ", ");
            else
                System.out.println(i+".");
            i++;
        }
        while (i<=20);
    }
}
