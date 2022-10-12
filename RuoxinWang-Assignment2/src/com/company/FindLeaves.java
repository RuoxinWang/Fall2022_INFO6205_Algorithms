package com.company;

import java.util.ArrayList;
import java.util.List;

public class FindLeaves {
    public List<List<Integer>> findLeaves(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        while(root != null){
            List<Integer> removedLeaves = new ArrayList<>();
            root = removeLeave(root, removedLeaves);
            result.add(removedLeaves);
        }
        return result;
    }
    public TreeNode removeLeave(TreeNode root, List<Integer> removedLeaves){
        if(root == null) return null;
        if(root.left == null && root.right == null){
            removedLeaves.add(root.val);
            return null;
        }
        root.left = removeLeave(root.left, removedLeaves);
        root.right = removeLeave(root.right, removedLeaves);
        return root;
    }
}
