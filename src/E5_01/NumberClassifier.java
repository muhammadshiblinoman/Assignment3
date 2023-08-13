package E5_01;

import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Integer Number : ");
        int num = scan.nextInt();
        scan.close();
        if(num > 0){
            System.out.println("The Number is positive");
        }
        else if(num < 0){
            System.out.println("The Number is negetive");
        }
        else {
            System.out.println("The Number is Zero");
        }
    }
}
