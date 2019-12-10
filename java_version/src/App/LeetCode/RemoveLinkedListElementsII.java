package App.LeetCode;

/*
    num: 82
    url: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
    tag: List DummyHead
    similar: 203
    给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。

    示例 1:

    输入: 1->2->3->3->4->4->5
    输出: 1->2->5

    示例 2:

    输入: 1->1->1->2->3
    输出: 2->3

 */

import DataStructure.List.ListNode;

import java.util.ArrayList;

public class RemoveLinkedListElementsII {
    public static class Solution {

        public ListNode removeElement(ListNode head, ArrayList<Integer> arr){
            return head;
        }

        public ListNode deleteDuplicates(ListNode head) {
            // 先找出重复元素的数字
            ArrayList<Integer> arr = new ArrayList<Integer>();
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            ListNode cur = head;
            while ( cur != null) {
                if(!arr.contains(cur.val)){
                    arr.add(cur.val);
                }else {
                    arr1.add(cur.val);
                }
                cur = cur.next;
            }

            // 删除重复元素数字
            return removeElement(head, arr1);
        }
    }

    private static void test(int arr[]) {
        ListNode head = new ListNode(arr);
        System.out.println(head);
        Solution s = new Solution();
        s.deleteDuplicates(head);
        System.out.println(head);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3,4,6,5};
        test(arr);

        final short NEWAGENTFLAG = (short) 0xFFFF;
        System.out.println((short) (NEWAGENTFLAG & 0xff));
        System.out.println((short) (NEWAGENTFLAG >> 8 & 0xff));
    }
}
