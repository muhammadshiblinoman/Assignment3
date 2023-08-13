package E5_07;

import java.util.Scanner;

public class CheckNumbersOrder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = scan.nextInt();

        scan.close();

        if(num1 < num2 && num2 < num3){
            System.out.println("increasing");
        }
        else if(num1 > num2 && num2 > num3){
            System.out.println("decreasing");
        }
        else{
            System.out.println("neither");
        }
    }
}
