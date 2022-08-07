import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0 ;
        float count = 0 ;
        while ( true){
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int input = scanner.nextInt();
                sum +=input;
                count++;
            }else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

        System.out.println("SUM = "+sum+" AVG = "+Math.round(sum/count));
    }
}
