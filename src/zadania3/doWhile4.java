package zadania3;

public class doWhile4 {
    public static void main(String[] args) {
        int i =1;
        int suma = 0;
        do {
            if (i%2==0)
                suma += i;
            i++;
        }
        while (i<=100);
        System.out.println(suma);
    }
}
