package DataStructure.List;

public class ListNode {

    public int val;
    public ListNode next = null;

    public ListNode(int x){
        val = x;
    }

    public ListNode(int[] arr){
        this.val = arr[0];
        ListNode curNode = this;
        for (int i = 1;i<arr.length;i++){
            curNode.next = new ListNode(arr[i]);
            curNode = curNode.next;
        }
    }
    public ListNode(ListNode head){
        ListNode curNode = this;
        this.val = head.val;
        head = head.next;
        while (head != null){
            curNode.next = new ListNode(head.val);
            curNode = curNode.next;
            head = head.next;
        }
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("");
        ListNode curNode = this;
        while (curNode != null){
            str.append(Integer.toString(curNode.val));
            str.append("->");
            curNode = curNode.next;
        }
        str.append("null");
        return str.toString();
    }
}

