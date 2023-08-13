package E5_22;

public class Paycheck {
    public final double PAR_HOUR = 9.25;
    public double PayCalculate(double hours){
        if(hours <= 40){
            return hours * PAR_HOUR;
        } else {
            return ((40 * PAR_HOUR) + ((hours - 40) * PAR_HOUR * 1.5)) ;
        }
    }
}
