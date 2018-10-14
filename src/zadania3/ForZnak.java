package zadania3;

public class ForZnak {
    public static void main(String[] args) {
        char znak;
        for (znak = 'A'; znak <= 'Z'; znak++) {
            if (znak < 'Z')
                System.out.print(znak + ", ");
            else
                System.out.print(znak + "."+"\n");
        }
        for (znak = 'Z'; znak >= 'A'; znak--) {
            if (znak > 'A')
                System.out.print(znak + ", ");
            else
                System.out.println(znak + ".");

        }
    }
}
