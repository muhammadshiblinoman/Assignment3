package E5_22;
import java.util.*;
public class PaycheackMain {
    public static void main(String [] args){

        Paycheck paycheck = new Paycheck();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How to working in a week?");
        double hours = scanner.nextDouble();

        System.out.println("Your Bll is " + paycheck.PayCalculate(hours));

        scanner.close();
    }
}
