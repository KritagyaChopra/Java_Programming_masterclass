package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while (true){
            System.out.println("Enter Number : ");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt)
                break;
            int input = scanner.nextInt();
            if (first){
                first=false;
                min=input;
                max = input;
            }
            if(input<min)
                min=input;
            if(input>max)
                max = input;
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Invalid input");
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);
    }
}
