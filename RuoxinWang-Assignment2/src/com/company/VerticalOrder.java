package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VerticalOrder {
    int min = 0;
    int max = 0;
    public List<List<Integer>> verticalOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        helper(root, 0);

        for(int i = min; i <= max; i++){
            result.add(new ArrayList<>());
        }
        Queue<TreeNode> node = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();

        node.offer(root);
        index.offer(-min);

        while(!node.isEmpty()){
            TreeNode curr = node.poll();
            int currIndex = index.poll();

            result.get(currIndex).add(curr.val);
            if(curr.left != null){
                node.offer(curr.left);
                index.offer(currIndex - 1);
            }
            if(curr.right != null){
                node.offer(curr.right);
                index.offer(currIndex + 1);
            }
        }
        return result;
    }
    public void helper(TreeNode root, int index){
        if(root == null) return;
        min = Math.min(min, index);
        max = Math.max(max, index);
        helper(root.left, index - 1);
        helper(root.right, index + 1);
    }
}
