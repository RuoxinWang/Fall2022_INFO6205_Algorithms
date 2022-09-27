package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        RotateList res1 = new RotateList();
        System.out.println("RotateList: ");
        printList(head1);
        printList(res1.rotateRight(head1, 2));
        System.out.println("----------");

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(4);
        head2.next.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next.next = new ListNode(6);

        Remove res2 = new Remove();
        System.out.println("Remove Element: ");
        printList(head2);
        printList(res2.removeElements(head2, 6));
        System.out.println("----------");

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(4);
        head3.next.next.next.next = new ListNode(5);
        Swap res3 = new Swap();
        System.out.println("Swap nodes: ");
        printList(head3);
        printList(res3.swapNodes(head3, 2));
        System.out.println("----------");






    }
    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.printf(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



}

