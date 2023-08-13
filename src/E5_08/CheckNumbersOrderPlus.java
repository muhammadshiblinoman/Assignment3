package E5_08;

import java.util.Scanner;

public class CheckNumbersOrderPlus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Mode if strict press 1 if lenient press 2 : ");

        int mode = scan.nextInt();
        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = scan.nextInt();

        scan.close();
        if(mode == 1 ){
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
        else{
            if(num1 <= num2 && num2 <= num3){
                System.out.println("increasing");
            }
            else if(num1 >= num2 && num2 >= num3){
                System.out.println("decreasing");
            }
            else{
                System.out.println("neither");
            }
        }
    }
}
