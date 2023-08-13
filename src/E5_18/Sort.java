package E5_18;
import java.util.*;
public class Sort {
    public static void main(String [] args){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("There three string");
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        ArrayList<String>name = new ArrayList<>();
        name.add(name1);
        name.add(name2);
        name.add(name3);
        Collections.sort(name);
        System.out.println(name.toString());


        scanner.close();
    }
}
