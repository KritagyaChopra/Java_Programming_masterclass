import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public  void reverse(int[] array){
        int[] rev = Arrays.copyOf(array , array.length);
        int temp ;
        int count = 1;
        for (int i = 0; i <array.length/2 ; i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        System.out.print("Array = [" );
        for (int i :rev){
            System.out.print(i);
            if(count<array.length){
                System.out.print(", ");
                count++;
            }
        }
        count=1;
        System.out.println("]");
        System.out.print("Reversed array = [");
        for (int j : array){
            System.out.print(j);
            if (count<array.length){
                System.out.print(", ");
                count++;
            }
        }
        System.out.println("]");

    }
}
