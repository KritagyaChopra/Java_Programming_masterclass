public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        int finNum=0;

        if (num<0)
            num = -1* num ;
        int iniNum =num ;

        while(num>0){
            finNum = finNum*10 + num%10;
            num = num/10;

        }

        return finNum == iniNum;
    }
}
