package E5_04;

import java.util.Scanner;

public class CompareFirstAndLastLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String inputString = scan.next();

        scan.close();

        char firstChar = inputString.charAt(0);
        char lastChar = inputString.charAt(inputString.length() - 1);

        if (firstChar == lastChar) {
            System.out.println("First and last letter are the same.");
        } else {
            System.out.println("First and last letter are different.");
        }
    }
}
