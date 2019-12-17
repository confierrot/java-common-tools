package com.zeroten.common.util;

public class ArrayUtils {
    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int tmp;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
