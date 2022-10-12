package com.company;

import java.util.LinkedList;
import java.util.List;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new LinkedList<>();
        rightView(root, result, 0);
        return result;
    }

    public void rightView(TreeNode curr, List<Integer> res, int currDepth){
        if(curr == null) return;
        if(currDepth == res.size()){
            res.add(curr.val);
        }
        rightView(curr.right, res, currDepth + 1);
        rightView(curr.left, res, currDepth + 1);
    }
}
