package com.frost;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
В убывающем порядке
*/

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int temp = 0;
        for(int j = 0; j < array.length; j ++ ){
            for(int i = 0; i < array.length - 1; i ++ ){
                if(array[i] < array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
