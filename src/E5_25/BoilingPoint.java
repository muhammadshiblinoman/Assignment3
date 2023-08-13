package E5_25;
import java.util.*;
public class BoilingPoint {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double bolling = scanner.nextDouble();
        double hight = scanner.nextDouble();

        bolling = bolling - (hight / 300);

        System.out.println("New Bolling Point = " + bolling);


        scanner.close();
    }
}
