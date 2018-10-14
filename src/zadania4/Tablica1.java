package zadania4;

public class Tablica1 {
    public static void main(String[] args) {
        int n = 10;
        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = n-1-i;
                System.out.println("dane ["+i+ "] =" + tab[i]);
            }
        }
    }
