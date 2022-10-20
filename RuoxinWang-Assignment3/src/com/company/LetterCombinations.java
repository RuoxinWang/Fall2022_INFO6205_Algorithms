package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return new ArrayList<>();
        Queue<String> result = new LinkedList<>();
        result.offer("");
        String[] letter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz"};

        for(int i = 0; i < digits.length(); i++){
            int num = digits.charAt(i) - '0';
            String str = letter[num];

            while(result.peek().length() == i){
                String curr = result.poll();
                for(char c : str.toCharArray()){
                    result.offer(curr + String.valueOf(c));
                }
            }
        }
        List<String> res = new ArrayList<>();
        while(!result.isEmpty()){
            res.add(result.poll());
        }
        return res;
    }
}
