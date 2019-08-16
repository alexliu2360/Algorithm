package App.LeetCode;

import Utils.ListHelper;
import List.ListNode;

import java.util.List;

/**
 * num:92
 * url: https://leetcode-cn.com/problems/reverse-linked-list-ii
 * tag: SingleList
 * <p>
 * Reverse a linked list from position m to n. Do it in one-pass.
 * <p>
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4
 * Output: 1->4->3->2->5->NULL
 */


public class ReversedLinkedListII {

    public static class Solution {
        /**
         * @param head: n
         * @return: The new head of reversed linked list.
         */


        public ListNode basicReverse(ListNode head) {
            if (head == null)
                return null;

            ListNode pre = null;
            ListNode cur = head;
            ListNode next = null;

            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }

            return pre;
        }

        public ListNode reverse(ListNode head, int m, int n) {
            if(head == null)
                return head;
            // 统计list的长度
            int length = 1;
            ListNode cur = head;
            while (cur != null){
                length ++;
                cur = cur.next;
            }
            // 判断m和n的合法性
            if (length == 1 || m < 1 || n < m)
                return head;
            // 找到m和n的位置
            cur = head;length=1;
            ListNode mthPreNode = null, mthNode = null, nthNode = null, nthNextNode = null;
            while (cur != null) {
                if (m == 1 && length == 1) {
                    mthPreNode = null;
                    mthNode = cur;
                }
                if (length == m - 1) {
                    mthPreNode = cur;
                    mthNode = cur.next;
                } else if (length == n) {
                    nthNode = cur;
                    nthNextNode = cur.next;
                }
                cur = cur.next;
                length++;
            }

            // reverse m-n的list
            ListNode pre = nthNextNode;
            cur = mthNode;
            ListNode next = null;
            while (cur != nthNextNode) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }

            // 返回
            if (mthPreNode == null) {
                return pre;
            } else {
                mthPreNode.next = pre;
                return head;
            }
        }
    }

    private static void test(int listLength, int m, int n) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < listLength; i++) {
            ListNode node = new ListNode(i);
            cur.next = node;
            cur = node;
        }
        Solution s = new Solution();
        System.out.println(head);
        head = s.reverse(head, m, n);
        System.out.println(head);
        System.out.println('\n');
    }

    public static void main(String args[]) {
       test(5, 2, 4);
       test(0, 0, 0);
       test(1, 1, 1);
       test(2, 1, 1);
       test(2, 1, 2);
    }

}
