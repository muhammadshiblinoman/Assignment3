package E5_15;

public class IncomeTax {
    public double Tax(double income){
        if(income <= 50000){
            return income * 0.01;
        } else if(income > 50000 && income <= 75000){
            return income * 0.02;
        } else if(income > 75000 && income <= 100000){
            return income * 0.03;
        } else if(income > 100000 && income <= 250000){
            return income * 0.04;
        } else if (income > 250000 && income <= 500000) {
            return income * 0.05;
        } else {
            return income * 0.06;
        }
    }
}
