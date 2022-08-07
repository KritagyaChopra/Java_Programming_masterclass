package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = 3;
        int[][] numbers = new int[row][col];
        fillingMatrix(sc, numbers, row, col);



        if(isSpecialSparseMatrix(numbers,row,col)){
            for (int a = 0; a < row; a++) {
                for (int b = 0; b < col; b++) {

                   if(numbers[a][b]==0){
                       if(row_sum(numbers,a,col)<=col_sum(numbers,b,row)){
                           int x = 0;
                           for (int i1 = 1; i1 < 20; i1++) {

                               if(((row_sum(numbers,a,col))+i1) %2 ==0){
                                   x=i1;
                                   numbers[a][b]= x;
                                   break;
                               }
                           }

                       }else{
                           int x = 0;
                           for (int i1 = 1; i1 < 20; i1++) {

                               if(((row_sum(numbers,a,col))+i1) %3 ==0){
                                   x=i1;
                                   numbers[a][b]= x;
                                   break;
                               }
                           }

                       }
                   }

                }
                if(! isSpecialSparseMatrix(numbers,row,col)){
                    break;
                }
            }
            printingMatrix(numbers,row,col);
        } else{
            System.out.println("-1");
        }

    }

    public static void fillingMatrix(Scanner scan, int[][] num, int rows, int columns) {

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                num[a][b] = scan.nextInt();
            }
        }
    }

    public static void printingMatrix(int[][] num, int rows, int columns) {
        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                System.out.print(num[a][b] + "\t");
            }
            System.out.println();
        }
    }
    public static boolean isSpecialSparseMatrix(int array[][], int m, int n) {
        int counter = 0;
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (array[i][j] == 0)
                    ++counter;

        return (counter > ((m * n) / 2));
    }
    static int row_sum(int array [][] ,int rowCount , int colums)
    {
        int sum = 0;
        for (int i = 0; i < colums; i++) {
            sum += array[rowCount][i];
        }
        return sum;
    }
    static int col_sum(int array [][] ,int colCount , int rows)
    {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += array[i][colCount];
        }
        return sum;
    }

}

