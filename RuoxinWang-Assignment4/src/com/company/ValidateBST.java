package com.company;

import java.util.Stack;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        Integer pre = null;

        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if(pre != null && curr.val <= pre){
                return false;
            }

            pre = curr.val;
            curr = curr.right;
        }

        return true;
    }
}
