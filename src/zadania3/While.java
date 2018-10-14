package zadania3;

public class While {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        do {
            y = 3*x;
            System.out.println("x = " +x+"\t"+"y = "+y);
            x++;
        }
        while (x<=10);


    }

}
