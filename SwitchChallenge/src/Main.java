import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        char test ;
        Scanner scanner = new Scanner(System.in);
//        test = scanner.next().charAt(0);
//        switch (test) {
//            case 'A':
//                System.out.println("A is typed ");
//                break;
//            case 'B':
//                System.out.println("B is typed");
//                break;
//            case 'C' :
//                System.out.println("C is typed");
//                break;
//            case 'D':
//                System.out.println("D is typed");
//                break;
//            case 'E' :
//                System.out.println("E is typed");
//                break;
//            default:
//                System.out.println("A,B,C,D,E not typed");
//        }
        System.out.println("enter btw 0 to 6 for getting a day");
        printDayOfTheWeek(scanner.nextInt());
    }
    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("enter btw 0 to 6");
        }
    }
}
