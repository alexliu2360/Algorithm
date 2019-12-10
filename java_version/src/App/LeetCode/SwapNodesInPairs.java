package App.LeetCode;
/*
    num: 24
    url: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
    tag: List

    给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

    你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

    示例:

    给定 1->2->3->4, 你应该返回 2->1->4->3.

 */

import DataStructure.List.ListNode;

public class SwapNodesInPairs {

    public static class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode preNode = new ListNode(0);
            preNode.next = head;

            ListNode p = preNode;
            while (p.next != null && p.next.next != null) {
                ListNode node1 = p.next;
                ListNode node2 = node1.next;
                ListNode next = node2.next;

                node2.next = node1;
                node1.next = next;
                p.next = node2;

                p = node1;
            }

            return preNode.next;
        }
    }

    private static void test(int arr[]) {
        ListNode head = new ListNode(arr);
        System.out.println(head);
        Solution s = new Solution();
        head = s.swapPairs(head);
        System.out.println(head);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3,4,6,5};
        test(arr);
    }
}
