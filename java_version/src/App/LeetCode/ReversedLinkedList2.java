package App.LeetCode;

import java.util.List;

/**
*
   num:92
    url: https://leetcode-cn.com/problems/reverse-linked-list-ii
    tag: SingleList

    Reverse a linked list from position m to n. Do it in one-pass.

    Note: 1 ≤ m ≤ n ≤ length of list.

    Example:

    Input: 1->2->3->4->5->NULL, m = 2, n = 4
    Output: 1->4->3->2->5->NULL

* */


public class ReversedLinkedList2 {

    public static class ListNode {
        public int val;
        public  ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public static class Solution {
        /**
         * @param head: n
         * @return: The new head of reversed linked list.
         */


        public ListNode basicReverse(ListNode head){
            if(head == null)
                return null;

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

        public ListNode reverse(ListNode head, int m, int n){

            // 判断m和n的合法性
            if (m < 1 || n < m)
                return head;

            // 找到m和n的位置
            int count = 0, length = 0;
            ListNode cur = head;
            ListNode mthPreNode = null, mthNode = null, nthNode = null, nthNextNode = null;
            while (cur != null){
                if (count == m-1){
                    mthPreNode = cur;
                    mthNode = cur.next;
                }
                else if (count == n) {
                    nthNode = cur;
                    nthNextNode = cur.next;
                }
                cur = cur.next;
                count ++;
            }

            // reverse m-n的list
            ListNode pre = nthNextNode;
            cur = mthNode;
            ListNode next = null;

            while (cur != nthNextNode){
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            mthPreNode = pre;

            // 返回
            return head;
        }
    }

    private static void test(){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for(int i = 1; i < 10; i++) {
            ListNode node = new ListNode(i);
            cur.next = node;
            cur = node;
        }
        Solution s = new Solution();
        head = s.reverse(head, 2, 4);
        System.out.println(head);
    }

    public static void main(String args[]){
       test();
    }

}
