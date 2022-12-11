package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String sorted = helper(str);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> temp : map.values()){
            result.add(temp);
        }
        return result;

    }
    public static String helper(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
//Time: O(2n)
