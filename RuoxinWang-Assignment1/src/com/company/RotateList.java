package com.company;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        //corner case
        if (head == null || head.next == null) {
            return head;
        }
        //find length
        ListNode index = head;
        int len = 1;
        while (index.next != null) {
            index = index.next;
            len++;
        }
        //make cycle
        index.next = head;

        //find the node before the target node and break the cycle
        if(k < len){
            for(int i = 1; i < len - k; i++ ){
                head = head.next;
            }
        } else {
            for(int i = 1; i < len - k % len; i++){
                head = head.next;
            }
        }
        ListNode result = head.next;
        head.next = null;
        return result;
    }


}
