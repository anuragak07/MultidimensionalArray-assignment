package com.masai.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElement {

    public static void main(String[] args){
        int n =3;
        int arr[][] = {{11, 22, 33},
                       {10, 11, 30},
                       {40, 50, 11}};
        DuplicateNumber(arr,n);
    }
    public static void DuplicateNumber(int arr[][],int n){

        HashMap<Integer,Integer> hp =new HashMap<>();
        for(int i =0; i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (hp.containsKey(arr[i][j])) {
                    hp.put(arr[i][j], hp.get(arr[i][j]) + 1);
                } else {
                    hp.put(arr[i][j], 1);
                }

            }
        }

        for(Map.Entry<Integer,Integer> map:hp.entrySet()){
            if(map.getValue()>1) {
                System.out.print(map.getKey() + " ");
            }

        }

    }
}
