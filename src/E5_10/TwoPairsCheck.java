package E5_10;

import java.util.Scanner;

public class TwoPairsCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the four integer number : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        scan.close();

        int pairsCount = 0;

        if (num1 == num2) {
            pairsCount++;
        }

        if (num1 == num3) {
            pairsCount++;
        }

        if (num1 == num4) {
            pairsCount++;
        }

        if (num2 == num3) {
            pairsCount++;
        }

        if (num2 == num4) {
            pairsCount++;
        }

        if (num3 == num4) {
            pairsCount++;
        }

        if (pairsCount >= 2) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }
    }
}
