package E5_19;
import java.util.*;
public class FloatingCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first two floating point number: ");
        double num1 = input.nextDouble();
        double num12 = input.nextDouble();

        System.out.print("Input second two floating point number: ");
        double num2 = input.nextDouble();
        double num22 = input.nextDouble();

        input.close();
        if (Math.abs(num1 - num2) <= 0.00 && Math.abs(num12 - num22) <= 0.00) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
        input.close();
    }
}
