package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        boolean fromLeft = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if(fromLeft == true){
                    level.add(curr.val);
                } else {
                    level.add(0, curr.val);
                }
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            result.add(level);
            fromLeft = !fromLeft;
        }
        return result;
    }
}
