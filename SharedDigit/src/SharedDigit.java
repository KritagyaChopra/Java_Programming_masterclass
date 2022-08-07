public class SharedDigit {
    public static boolean hasSharedDigit(int num1 , int num2){
        if(num1<10||num1>99||num2<10||num2>99){
            return false;
        }
        int firstnum1 = num1 %10;
        int secondnum1 = (num1/10)%10;
        int firstnum2 = num2 %10;
        int secondnum2 = (num2/10)%10;
        if(firstnum1==firstnum2 || firstnum1 == secondnum2 || secondnum1 == firstnum2 || secondnum1 == secondnum2){
            return true;
        }
        return false;

    }
}
