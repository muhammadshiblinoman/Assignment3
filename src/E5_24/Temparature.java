package E5_24;
import java.util.*;
public class Temparature {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double temp = scanner.nextDouble();

        if(name.equals("C")){
            if(temp < 0.0){
                System.out.println("Solid");
            } else if(temp <= 100.00 && temp > 0.0){
                System.out.println("liquid");
            } else {
                System.out.println("gaseous");
            }
        } else{
            if(temp < 32){
                System.out.println("Solid");
            } else if(temp <= 212 && temp > 32){
                System.out.println("Liquid");
            } else{
                System.out.println("gaseous");
            }
        }

        scanner.close();
    }
}
