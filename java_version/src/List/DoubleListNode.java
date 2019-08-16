package List;

public class DoubleListNode {

    public int val;
    public DoubleListNode next = null;
    public DoubleListNode prev = null;
    public DoubleListNode(int x){
        val = x;
    }

    public DoubleListNode(int[] arr){
        this.val = arr[0];
        DoubleListNode curNode = this;
        for (int i = 0;i<arr.length;i++){
            curNode.val = arr[i];
            curNode = curNode.next;
        }
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("");
        DoubleListNode curNode = this;
        while (curNode != null){
            str.append(Integer.toString(curNode.val));
            str.append("<=>");
            curNode = curNode.next;
        }
        str.append("null");
        return str.toString();
    }
}


