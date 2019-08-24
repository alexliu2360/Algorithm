package App.LeetCode;

import DataStructure.List.ListNode;

/**
*
    url: https://leetcode-cn.com/problems/reverse-linked-list/
    tag: SingleList

    Reverse a singly linked list.
    Example:

    Input: 1->2->3->4->5->NULL
    Output: 5->4->3->2->1->NULL

* */


public class ReversedLinkedList {

    public static class Solution {
        /**
         * @param head: n
         * @return: The new head of reversed linked list.
         */
        public ListNode reverse(ListNode head) {
            if (head == null)
                return null;

            ListNode prev = head;
            ListNode cur = head.next;
            while (cur != null) {
                prev.next = cur.next;
                cur.next = head;
                head = cur;
                cur = prev.next;
            }
            return head;
        }

        public ListNode reverse2(ListNode head){
            if(head == null)
                return head;
            ListNode pre = null;
            ListNode cur = head;
            ListNode next = null;

            while (cur != null){
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }
    }

    private static void test(int listLength){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for(int i = 1; i < listLength; i++) {
            ListNode node = new ListNode(i);
            cur.next = node;
            cur = node;
        }
        Solution s = new Solution();
        head = s.reverse(head);
        System.out.println(head);
        head = s.reverse2(head);
        System.out.println(head);
    }

    public static void main(String args[]){
       test(10);
    }

}
