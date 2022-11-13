package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public List<Integer> parentNode(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        helper(res, root);
        return res;
    }
    public void helper(List<Integer> res, TreeNode root){
        if(root == null) return;
        res.add(root.val);
        if(root.left != null || root.right != null){
            helper(res, root.left);
            helper(res, root.right);
        }
    }

}
