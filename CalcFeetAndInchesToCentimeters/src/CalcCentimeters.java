public class CalcCentimeters {
    public static double calcFeetAndInchesToCentimeters ( double feet , double inches){
        if(feet<=0 || inches< 0 ||inches>12){
            return -1;
        }
        else {
            return (inches*2.54 + feet*12*2.54 );
        }
    }
    public static double calcFeetAndInchestoCentimeters ( double inches){
        if ( inches<=0 ){
            return -1;
        }
        double feet = inches/12;
        inches -= feet*12 ;
        return calcFeetAndInchesToCentimeters(feet , inches);
    }
}
