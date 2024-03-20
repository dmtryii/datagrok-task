package com.dmtryii;

/*
    Write a function that takes a head node of a singly linked list (containing at least k+1 elements),
    and returns kth element to the last node in the list.

    kthToLastNode(LinkedListNode head, int k)
 */

public class KthToLastNode {
    public static LinkedListNode kthToLastNode(LinkedListNode head, int k) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                throw new IllegalArgumentException("List has fewer than k+1 elements");
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
