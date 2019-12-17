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

    public static void main(String[] args) {
        System.out.println(isAnyEmpty("123", "789"));
    }
}
