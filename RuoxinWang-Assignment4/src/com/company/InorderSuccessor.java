package com.company;

public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null) return null;

        if(p.val < root.val){
            TreeNode temp = inorderSuccessor(root.left, p);
            return (temp == null) ? root : temp;
        } else {
            return inorderSuccessor(root.right, p);
        }
    }
}
