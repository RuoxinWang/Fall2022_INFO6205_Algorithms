package com.company;

public class Remove {
    public ListNode removeElements(ListNode head, int val){
        //corner case
        if(head == null){
            return head;
        }
        //create a fake head and make it connect to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        //if the node's val after curr is same as val,then skip the node after curr, make curr connect to the curr.next.next
        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        //return the node after the fake head
        return dummy.next;
    }
}
