package com.company;

public class Q4 {
    public Node insert(Node head, Integer data){
        Node insertNode = new Node(data);
        if(head == null){
            head = insertNode;
            return head;
        }
        if(head.val < data){
            head = head.next;
        }
        if(head.next != null) {
            head.next = insertNode;
            insertNode.next = head.next.next;
        } else {
            head.next = insertNode;
        }

        return head;
    }
}
