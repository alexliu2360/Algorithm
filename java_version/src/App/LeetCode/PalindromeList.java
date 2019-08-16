package App.LeetCode;
/*
num: 234
url: https://leetcode-cn.com/problems/palindrome-linked-list/
tag: list palindrome double-pointer
请判断一个链表是否为回文链表。

示例 1:

输入: 1->2
输出: false

示例 2:

输入: 1->2->2->1
输出: true

 */
import List.ListNode;

import java.lang.reflect.Array;
import java.util.List;

public class PalindromeList {

    public static class Solution {

        public ListNode copyList(ListNode head){
            ListNode tmp = new ListNode(head.val);
            ListNode curNode = tmp;
            head = head.next;
            while (head != null){
                curNode.next = new ListNode(head.val);
                curNode = curNode.next;
                head = head.next;
            }
            return tmp;
        }

        public ListNode reverse(ListNode head){
            if(head == null)
                return head;

            ListNode pre = null;
            ListNode cur = copyList(head);
            ListNode next = null;

            while (cur != null){
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }

        public boolean isPalindrome(ListNode head) {
            // 先翻转链表并存于一个新节点中
            ListNode newNode = reverse(head);

            // 依次比较两个链表
            ListNode curNode = head;
            while (curNode != null){
                if(curNode.val != newNode.val)
                    return false;
                curNode = curNode.next;
                newNode = newNode.next;
            }
            return true;
        }
    }

    private static void test(int[] arr) {
        ListNode head = new ListNode(arr);
        System.out.println(head);
        Solution s = new Solution();
        System.out.println(s.isPalindrome(head));
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1,2,3};
        test(arr);

        int[] arr0 = {1, 1, 2, 1};
        test(arr0);

        int[] arr1 = {1, 2, 2, 1};
        test(arr1);

        int[] arr2 = {1, 2, 1};
        test(arr2);

        int[] arr3 = {1};
        test(arr3);
    }
}
