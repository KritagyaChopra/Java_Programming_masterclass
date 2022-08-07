import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = sc.nextInt();
        int[] arr = readIntegers(count);
        System.out.println(findMin(arr));

    }
    public static int[] readIntegers(int number){
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<=min){
                min = array[i];
            }
        }
        return min;
    }

}
