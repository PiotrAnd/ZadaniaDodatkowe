package obiektowe.trojkat;

public class Main {
    public static void main(String[] args) {
        int n =10;
        int i;

        Triangle liczby = new Triangle();
        for (i=1;i<=n;i++){
            System.out.println("#"+i+" = " + liczby.triangle(i));
        }
    }
}
