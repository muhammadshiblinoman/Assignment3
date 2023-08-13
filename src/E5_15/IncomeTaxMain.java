package E5_15;
import java.util.*;
public class IncomeTaxMain {
    public static void main(String [] args){

        IncomeTax incometax  = new IncomeTax();
        Scanner scanner = new Scanner(System.in);

        double income = scanner.nextDouble();
        System.out.println(incometax.Tax(income));

        scanner.close();
    }
}
