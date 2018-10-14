package zadania3;

public class While4 {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        while (i<=100){
            if (i%2!=0)
                suma += i;
            i++;
        }
        System.out.println(suma);
    }
}
