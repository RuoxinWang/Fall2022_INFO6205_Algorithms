package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxWidth {
    public int widthOfBinaryTree(TreeNode root){
        if(root == null) return 0;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            max = Math.max(max, queue.peekLast().val - queue.peekFirst().val);
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                if(curr.left != null){
                    curr.left.val = curr.val * 2;
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    curr.right.val = curr.val * 2 + 1;
                    queue.offer(curr.right);
                }
            }
        }
        return max + 1;
    }
}
