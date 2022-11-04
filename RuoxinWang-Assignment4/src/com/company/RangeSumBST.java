package com.company;

public class RangeSumBST {
    int res = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root, low, high);
        return res;
    }

    void helper(TreeNode root, int low, int high){
        if(root == null){
            return;
        }
        if(low <= root.val &&  root.val <= high){
            res += root.val;
        }
        helper(root.left, low, high);
        helper(root.right, low, high);
    }
}
