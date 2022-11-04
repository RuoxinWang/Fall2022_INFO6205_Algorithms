package com.company;

public class TreeToDoublyList {
    Node head = null;
    Node pre = null;
    public Node treeToDoublyList(Node root) {
        if(root == null) return root;

        helper(root);

        head.right.left = pre;
        pre.right = head.right;

        return head.right;
    }

    private void helper(Node root){
        if(root == null) return;
        helper(root.left);

        // first node
        if(head == null){
            head = new Node();
            head.right = root;
        } else {
            pre.right = root;
            root.left = pre;
        }

        pre = root;

        helper(root.right);
    }
}
