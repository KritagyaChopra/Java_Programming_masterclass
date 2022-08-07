public class NumberToWords {
    public static void numberToWords ( int number){

        int count = getDigitCount(number);
        number = reverse(number);
        if (count==-1){
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 0; i < count; i++) {
            int x = number%10;


            switch (x) {
                case 0 :
                    System.out.print("Zero ");
                    break;
                case 1 :
                    System.out.print("One ");
                    break;
                case 2 :
                    System.out.print("Two ");
                    break;
                case 3 :
                    System.out.print("Three ");
                    break;
                case 4 :
                    System.out.print("Four ");
                    break;
                case 5 :
                    System.out.print("Five ");
                    break;
                case 6 :
                    System.out.print("Six ");
                    break;
                case 7 :
                    System.out.print("Seven ");
                    break;
                case 8 :
                    System.out.print("Eight ");
                    break;
                case 9 :
                    System.out.print("Nine ");
                    break;
                }
            number/=10;
        }
        System.out.println("\n");
    }
    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        int count = 0;
        do{
            number/=10;
            count +=1;
        }while(number!=0);
        return count;
    }
    public static int reverse(int number){
        int res = 0;
        while (number!=0){
            int x = number % 10;
            res = res * 10 + x;

            number /= 10;
        }
        return res;
    }
}

