package E5_05;

import java.util.Scanner;

public class CompareHalfWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");

        String inputWord = scan.next();

        scan.close();

        int wordLength = inputWord.length();

        int firstHalfEndIndex = wordLength / 2;
        int secondHalfStartIndex = 0;
        if(wordLength % 2 == 0){
            secondHalfStartIndex =  firstHalfEndIndex;
        }
        else{
            secondHalfStartIndex =  firstHalfEndIndex + 1;
        }

        String firstHalf = inputWord.substring(0, firstHalfEndIndex);
        String secondHalf = inputWord.substring(secondHalfStartIndex);

        if (firstHalf.equals(secondHalf)) {
            System.out.println("First and second half are the same.");
        } else {
            System.out.println("First and second half are different.");
        }
    }
}
