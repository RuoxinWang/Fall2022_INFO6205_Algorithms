package com.company;

public class ListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return helper(head, null);
    }

    private TreeNode helper(ListNode start, ListNode end){
        if(start == end) return null;

        ListNode slow = start;
        ListNode fast = start;

        while(fast != end && fast.next != end){
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);
        root.left = helper(start, slow);
        root.right = helper(slow.next, end);
        return root;
    }
}
