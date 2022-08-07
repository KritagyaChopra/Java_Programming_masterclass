public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1 , int num2 , int num3){
        if(num1<10 || num1>1000 || num2<10 || num2>1000 || num3<10 || num3>1000   ){
            return false;
        }
        int lastnum1 = num1%10;
        int lastnum2 = num2%10;
        int lastnum3 = num3%10;
        if(lastnum1==lastnum2 || lastnum1 == lastnum3 || lastnum2== lastnum3){
            return true;
        }
        return false;
    }
    public static boolean isValid(int num){
        if(num<10 ||num>1000)
            return false;
        return true;
    }
}
