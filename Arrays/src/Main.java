import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] input = getIntegers(5);
        int[] result = sortInteger(input);
        printArray(input);

    }

    public static void printArray(int[] array){
        for (int i=0 ; i<array.length ; i++) {
            System.out.println("Element " + i +" contents " + array[i]);
        }
    }
    public static int[] getIntegers(int number){
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            result[i]=sc.nextInt();
        }
        return result;
    }
    public static int[] sortInteger(int[] arr){

        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
