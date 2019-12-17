package com.zeroten.javales;

import java.util.Arrays;

public class CheckUtils {
    public static boolean isAnyEmpty(String... strings) {
        if (strings.length == 0) {
            return false;
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("")) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object[] arr) {
        if(arr == null || arr.length==0) {
            return  true;
        }
        return false;
    }

    public static boolean equals(String str1, String str2) {
        if(str1 == null || str2 == null){
            return false;
        }
        return str1.equals(str2);
    }
    public static boolean equals(Integer n1, Integer n2) {
        if(n1 == null || n2 == null) {
            return false;
        }
        return n1.equals(n2);
    }


    public static void main(String[] args) {
        System.out.println(isAnyEmpty("123", "789"));
    }
}
