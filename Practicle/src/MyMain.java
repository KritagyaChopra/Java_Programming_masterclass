import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

public class MyMain {


    private  NullValueCustomException exception;

    public static void main(String[] args) throws NullValueCustomException {
        MyMain main = new MyMain();
        Student student = new Student();
        ArrayList<String> array =  new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Data of How many Student :");
        int len = scanner.nextInt();
        System.out.println("now enter values of name , email . mobile , roll no respectively in order every line");
        for (int i = 0; i < len; i++) {
            student.setName(scanner.next());
            student.setEmail(scanner.next());
            student.setMobile(scanner.nextInt());
            student.setRollNumber(scanner.nextInt());
            array.add(student.toString());
        }
        //array.add(null);

        try{
            main.display(array);

        }
        catch (NullValueCustomException | NullPointerException e){
            System.out.println("Null Element");
        }



    }
    public <T> void display(ArrayList<String> array) throws NullValueCustomException{
        for (int i = 0; i < array.size(); i++) {
            if(  array.get(i)==null ) {
                throw exception;
            }
            else {
                System.out.println(array.get(i));
            }
        }


    }
}
