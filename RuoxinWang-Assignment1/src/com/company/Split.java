package com.company;

public class Split {
    public ListNode[] splitListToParts(ListNode head, int k) {
        //find length
        ListNode index = head;
        int len = 0;
        while(index != null){
            index = index.next;
            len++;
        }
        //find least size, and remainder
        int size = len  / k;
        int remainder = len % k;
        int i = 0;
        ListNode[] res = new ListNode[k];
        ListNode curr = head;
        ListNode pre = head;
        while(curr != null){
            res[i++] = curr;
            int m = 0;
            int n = size + (remainder-- > 0 ? 1 : 0);
            while(m != n){
                pre = curr;
                curr = curr.next;
                m++ ;
            }
            pre.next = null;
        }
        return res;
    }
}
