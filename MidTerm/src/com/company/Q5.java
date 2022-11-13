package com.company;

public class Q5 {
    public static int[] getStartOfEachValues(int[] arr, int[] values) {
        int i = 0;
        int j = 0;
        //int[] index = new int[arr.length];
        int[] res = new int[values.length];
        for (i = 0; i < arr.length; i++) {
            //index[i] = i;
            for (j = 0; j < values.length; j++) {
                if (arr[i] == values[j]) {
                    res[j] = i;
                }
            }
        }
        return res;
    }
}
