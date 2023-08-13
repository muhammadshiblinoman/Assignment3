package E5_20;
import java.util.*;
public class VowelConsonantMain {
    public static void main(String []args){
        VowelConsonant vowel = new VowelConsonant();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Character Input : ");
        String character = scanner.nextLine();
        System.out.println(vowel.Return(character));

        scanner.close();
    }
}
