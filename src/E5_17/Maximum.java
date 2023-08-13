package E5_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maximum {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("There three number");
        double name1 = scanner.nextDouble();
        double name2 = scanner.nextDouble();
        double name3 = scanner.nextDouble();
        ArrayList<Double> name = new ArrayList<>();
        name.add(name1);
        name.add(name2);
        name.add(name3);
        Collections.sort(name);

        System.out.println(name.get(2));

        scanner.close();
    }
}
