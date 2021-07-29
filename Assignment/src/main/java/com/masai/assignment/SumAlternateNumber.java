package com.masai.assignment;

public class SumAlternateNumber {
    public static void main(String[] args){
        int n =10;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        AlternateNumber(arr,n);
    }

    public static void AlternateNumber(int arr[],int n){
        int sum =0;
        for(int i =0; i<n; i+=2) {
            sum += arr[i];
        }
            System.out.print(sum);

    }

}
