package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Q3 {
    private static String returnValidString(String str){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push(i);
            }else if (str.charAt(i) == ')'){
                if(stack.isEmpty()){
                    index.add(i);
                }else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()){
            index.add(stack.pop());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<str.length(); i++){
            if (!index.contains(i)){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
//Time: O(2n)
