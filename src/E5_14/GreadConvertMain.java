package E5_14;
import java.util.*;
public class GreadConvertMain {
    public static void main(String [] args){
        GreadConvert gradecon = new GreadConvert();
        Scanner scanner = new Scanner(System.in);
        double grade = scanner.nextDouble();

        System.out.println("Your Grade is" + gradecon.Convert(grade));

        scanner.close();
    }
}
