package com.company;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, result, target, new ArrayList<Integer>(), 0);
        return result;
    }

    private void helper(int[] nums, List<List<Integer>> res, int target, List<Integer> temp, int start){
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(temp));
                return;
        }
        for(int i  = start; i <  nums.length; i++){
            temp.add(nums[i]);
            helper(nums, res, target - nums[i], temp, i);
            temp.remove(temp.size() - 1);
        }
    }

}
