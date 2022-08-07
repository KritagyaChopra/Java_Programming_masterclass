public class DigitSumChallenge {
    public static int sumDigit(int num){
        int sum=0 ;
        if (num<10){
            return -1;
        }
        while(num!=0){
            sum +=num%10;
            num=num/10;
        }
        return sum;
    }
}
