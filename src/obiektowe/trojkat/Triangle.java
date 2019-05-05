package obiektowe.trojkat;

public class Triangle {
    public static int triangle(int n){
        if (n==1)
            return 1;
        else
            return (n+triangle(n-1));
    }

}
