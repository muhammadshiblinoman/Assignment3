package E5_06;

import java.util.Scanner;

public class CompareThreeNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = scan.nextInt();

        scan.close();

        if(num1 == num2 && num2 == num3){
            System.out.println("all the same");
        }
        else if(num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("all different");
        }
        else{
            System.out.println("neither");
        }
    }
}
