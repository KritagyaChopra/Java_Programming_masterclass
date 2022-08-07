package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0 ;
        int sum = 0;
        while (counter!=10){
            System.out.println("Enter number #"+(counter+1)+" : ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int x = scanner.nextInt();
                sum+=x;
                counter++;
            }
            else{
                System.out.println("Invalid Number");
            }

        }
        System.out.println(sum);
        scanner.close();
    }
}
