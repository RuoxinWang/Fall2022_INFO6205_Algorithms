package com.company;


public class Swap {
    public ListNode swapNodes(ListNode head, int k){

        //create two pointer
        ListNode left = head;
        ListNode right = head;
        //move right to the target node
        for(int i = 1; i < k; i++){
            right = right.next;
        }
        ListNode target = right;
        //move two pointers together, keep the gap between two pointers, stop when right pointer reach the end
        while(right.next != null){
            right = right.next;
            left = left.next;
        }
        int temp = left.val;
        left.val = target.val;
        target.val = temp;

        return head;

    }

}
