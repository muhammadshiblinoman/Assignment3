package E5_20;

public class VowelConsonant {
    public String Return(String character){
        if(character.equals("A") || character.equals("E") || character.equals("I") || character.equals("O")
        || character.equals("U")){
            return "That is vowel";
        } else if(character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o")
                || character.equals("u")){
            return "That is vowel";
        } else{
            return "That is consonant";
        }
    }
}
