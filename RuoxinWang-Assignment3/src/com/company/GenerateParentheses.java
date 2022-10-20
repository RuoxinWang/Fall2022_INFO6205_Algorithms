package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        helper("", n, n);
        return res;

    }
    private void helper(String curr, int left, int right){
        if(left == 0 && right == 0){
            res.add(curr);
            return;
        }
        if(left > 0){
            helper(curr + "(", left - 1, right);
        }
        if(right > left) {
            helper(curr + ")", left, right - 1);
        }
    }
}
