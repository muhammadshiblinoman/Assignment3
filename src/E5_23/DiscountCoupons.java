package E5_23;

import java.util.*;
public class DiscountCoupons {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter the cost of your groceries:");
        double amount = scanner.nextDouble();

        if(amount < 10.00){
            System.out.println("No coupon");
        } else if(amount >= 10 && amount <= 60){
            System.out.println("You win a discount coupon of $ " + amount * 0.08 + "(8% of your purchase)");
        } else if(amount > 60 && amount <= 150){
            System.out.println("You win a discount coupon of $ " + amount * 0.10 + "(10% of your purchase)");
        } else if(amount > 150 && amount <= 210){
            System.out.println("You win a discount coupon of $ " + amount * 0.12 + "(12% of your purchase)");
        } else {
            System.out.println("You win a discount coupon of $ " + amount * 0.14 + "(14% of your purchase)");
        }


        scanner.close();
    }
}
