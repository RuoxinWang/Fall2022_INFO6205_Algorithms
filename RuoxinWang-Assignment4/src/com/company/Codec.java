package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {
    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder res = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);


        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            if(node == null){
                res.append("null ");
                continue;
            }

            res.append(node.val + " ");
            queue.offer(node.left);
            queue.offer(node.right);
        }
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0) return null;

        String[] strs = data.split(" ");
        TreeNode root = new TreeNode(Integer.valueOf(strs[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for(int i = 1; i < strs.length; i++){
            TreeNode node = queue.poll();
            if(!strs[i].equals("null")){
                node.left = new TreeNode(Integer.valueOf(strs[i]));
                queue.offer(node.left);
            }
            i++;
            if(!strs[i].equals("null")){
                node.right = new TreeNode(Integer.valueOf(strs[i]));
                queue.offer(node.right);
            }
        }

        return root;
    }
}
