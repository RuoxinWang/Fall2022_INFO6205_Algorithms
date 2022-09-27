package com.company;

public class Insert {
    public Node insert(Node head, int insertVal) {
        Node insertNode = new Node(insertVal);
        //no node
        if(head == null){
            head = insertNode;
            insertNode.next = head;
            return head;
        }
        //one node
        if(head.next == head){
            if(head.val < insertVal){
                head.next = insertNode;
                insertNode.next = head;
                return head;
            } else {
                insertNode.next = head;
                head.next = insertNode;
                return head;
            }

        }

        Node curr = head;
        //curr <= insert <= curr.next
        while(curr.next != head){
            if(curr.val <= insertVal && insertVal <= curr.next.val){
                break;
            }
            //when curr > curr.next, node 4 -> node 1
            // insert > curr > curr.next || insert < curr.next < curr
            else if(curr.val > curr.next.val){
                if(curr.next.val >= insertVal || curr.val <= insertVal ){
                    break;
                }
            }
            curr = curr.next;
        }
        Node currNode = curr.next;
        curr.next = insertNode;
        insertNode.next = currNode;
        return head;
    }
}
