package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(result, nums, 0, list);
        return result;

    }
    private void helper(List<List<Integer>> res, int[] nums, int index, List<Integer> temp){
        res.add(new ArrayList<Integer>(temp));
        for(int i = index; i < nums.length; i++){
            temp.add(nums[i]);
            helper(res, nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
