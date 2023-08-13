package E5_02;

import java.util.Scanner;

public class NumberClassifierAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");

        double num = scan.nextDouble();

        scan.close();

        if (num == 0) {
            System.out.print("zero");
        } else if (num > 0) {
            System.out.print("positive");
        } else {
            System.out.print("negative");
        }

        double abs = Math.abs(num);
        if (abs < 1) {
            System.out.println(", small");
        } else if (abs > 1000000) {
            System.out.println(", large");
        } else {
            System.out.println();
        }
    }
}
