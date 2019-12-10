package App.LeetCode;
/*
    num: 24
    url: https://leetcode-cn.com/problems/partition-list
    tag: List
    难度：medium
    给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。

    你应当保留两个分区中每个节点的初始相对位置。

    示例:

    输入: head = 1->4->3->2->5->2, x = 3
    输出: 1->2->2->4->3->5


 */

import DataStructure.List.ListNode;

public class PartitionList {

    public static class Solution {
        public ListNode partition(ListNode head, int x) {
           return null;
        }
    }

    private static void test(int arr[]) {
        ListNode head = new ListNode(arr);
        System.out.println(head);
        Solution s = new Solution();
        head = s.partition(head, 3);
        System.out.println(head);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3,4,6,5};
        test(arr);
    }
}
