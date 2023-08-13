package E5_03;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Integer Number: ");

        int num = scan.nextInt();

        scan.close();

        if (num < 0) {
            num = num * -1;
        }


        int count = 0;

        if (num == 0) {
            count = 1;
        } else {

            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("The number of digits is: " + count);
    }
}
