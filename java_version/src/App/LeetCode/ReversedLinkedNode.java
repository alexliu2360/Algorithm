package App.LeetCode;

public class ReversedLinkedNode {

    public class RLNTest {
        public void test(){
            ListNode head = new ListNode(0);
            ListNode cur = head;
            for(int i = 1; i < 10; i++) {
                ListNode node = new ListNode(i);
                cur.next = node;
                cur = node;
            }
            Solution s = new Solution();
            head = s.reverse(head);
            System.out.println(head);
        }
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public class Solution {
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
    }

}
