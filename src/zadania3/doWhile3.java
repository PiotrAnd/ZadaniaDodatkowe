package zadania3;

public class doWhile3 {
    public static void main(String[] args) {
        int i =1;
        int suma = 0;
        do {
            suma += i;
            i++;
        }
        while (i<=100);
        System.out.println(suma);
    }
}
