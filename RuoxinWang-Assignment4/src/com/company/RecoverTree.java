package com.company;

import java.util.Stack;

public class RecoverTree {
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;

        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || curr != null){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            } else{
                curr = stack.pop();
                if(prev != null && prev.val >= curr.val){
                    if(first == null) first = prev;
                    second = curr;
                }
                prev = curr;
                curr = curr.right;
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}
