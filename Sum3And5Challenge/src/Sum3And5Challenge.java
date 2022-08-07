public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int i = 1; i < 1001; i++) {
            if (i%3+i%5==0){
                sum+=i;
                System.out.println(i);
                count++;
                if(count==5)
                    break;
            }

        }
        System.out.println(sum);

    }

}
