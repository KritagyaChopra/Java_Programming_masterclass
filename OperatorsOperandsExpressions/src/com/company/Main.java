package com.company;

public class Main {

    public static void main(String[] args) {
        double myDoubleValue = 20.00 ;
        double my2DoubleValue = 80.00 ;
        boolean result = (((my2DoubleValue + myDoubleValue) * 100.00) % 40) == 0 ;

        System.out.println(result);
        if (!result){
            System.out.println("Got Some Remainder");

        }
    }
}
