public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<2)
            return -1;
        int sum = 2;
        for (int i = 2; i <= number; i++) {
            if (number%i==0){
                int flag = 0 ;
                for (int j = 2; j < i ; j++) {
                    if(i%j == 0)
                        flag++;
                }

                if(flag == 0){
                    if(i>sum){
                        sum = i;
                    }
                }
            }
        }
        return sum;

    }
}