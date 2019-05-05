package zadaniaRychlicki.zadania3;

import java.util.Scanner;

public class OperatoLogiczny {
    public static void main(String[] args) {
        double cm;
        int foot, inches, remaider;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner scanner = new Scanner(System.in);
        cm = scanner.nextDouble();
        inches = (int) (cm / CM_PER_INCH);
        foot = inches / IN_PER_FOOT;
        remaider = inches%IN_PER_FOOT;
        System.out.printf("%.2f cm = %d st., %d cali\n", cm, foot, remaider);

    }
}
