package com.company;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), nums);
        return result;
    }
    private void helper(List<List<Integer>> list, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            helper(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
