public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking , int hourOfDay){
        if(barking && hourOfDay<8 && hourOfDay>=0 || hourOfDay == 23){
            return true;
        }
        return false;
    }
}