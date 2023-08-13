package E5_21;
import java.util.*;
public class MonthMain {
    public static void main(String [] args){
        Month month = new Month();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month : ");
        int months = scanner.nextInt();

        month.MonthCheck(months);

        scanner.close();
    }
}
