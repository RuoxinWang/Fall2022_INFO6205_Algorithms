package com.company;


import java.util.*;

public class SameConsecutiveDifferences {
    List<Integer> list;
    public int[] numsSameConsecDiff(int n, int k) {
        list = new ArrayList<>();
        for(int i = 1; i <= 9; i++) {
            helper(i,1, n, k);
        }

        int len = list.size();
        int[] res  = new int[len];
        for(int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void helper(int num, int i, int n, int k){
        if(i == n){
            list.add(num);
            return;
        }

        // To check for +k and -k results with the last digit
        int a = num % 10;
        if(k == 0){
            int temp = (num * 10) + a;
            helper(temp,i + 1, n, k);
        }
        else{
            if(a + k <= 9){
                int temp = (num * 10) + (a + k);
                helper(temp,i + 1, n, k);
            }
            if(a - k >= 0){
                int temp = (num * 10) + (a - k);
                helper(temp, i + 1, n, k);
            }
        }
    }
}
