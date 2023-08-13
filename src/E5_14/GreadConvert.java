package E5_14;

public class GreadConvert {
    public String Convert(double grade){
        if(grade == 4.0){
            return "A+";
        } else if(grade >= 3.75 && grade < 4.0){
            return "A";
        } else if(grade >= 3.5 && grade < 3.75){
            return "A-";
        } else if(grade >= 3.25 && grade < 3.50){
            return  "B+";
        } else if(grade >= 3.0 && grade < 3.25){
            return "B";
        } else if (grade >= 2.75 && grade < 3.0) {
            return "B-";
        } else if(grade >= 2.50 && grade < 2.75){
            return  "C+";
        }else if(grade >= 2.25 && grade < 2.50 ){
            return "c";
        }else if(grade >= 2.0 && grade < 2.25){
            return "D";
        } else{
            return "Fail";
        }
    }
}
