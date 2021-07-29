package com.masai.assignment;
//reverse the order of matrix

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int n = 3;
        int arr[][] ={{11, 22, 33},
                      {10, 20, 30},
                      {40, 50, 60}};
        Reverse(arr,n);
        }

    public static void Reverse(int arr[][],int n){
         for(int i =n-1;i>=0;i--) {
             for (int j = n - 1; j >= 0; j--) {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }

    }
}