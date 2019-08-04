package Tree;


public class BST<Key extends Comparable<Key>, Value> {

    // 定义节点
    private class Node {
        private Key key;
        private Value value;
        private Node left, right;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            this.left = this.right = null;
        }
    }

    private Node root = null; //根节点
    private int count;  // 树种的节点个数

    public BST() {
        root = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(Key key, Value value) {
        root = insert(root, key, value);
    }

    private Node insert(Node node, Key key, Value value) {
        if(node == null){
            count++;
            return new Node(key, value);
        }

        if(key.compareTo(node.key)<0){
            insert(node.left, key, value);
        } else if (key.compareTo(node.key) > 0){
            insert(node, key, value);
        } else {
            node.value = value;
        }
        return node;
    }

    private Value search(Node node, Key key){
        if(node == null)
            return null;

        if(key.compareTo(node.key)<0){
            return search(node.left, key);
        } else if(key.compareTo(node.key)>0){
            return search(node.right, key);
        } else {
            return node.value;
        }
    }

    private void delete(Node node){
        return;
    }

    public static void main(String[] args) {
        int N = 1000000;

        // 创建一个数组，包含[0...N)的所有元素
        Integer[] arr = new Integer[N];
        for(int i = 0 ; i < N ; i ++)
            arr[i] = new Integer(i);

        // 打乱数组顺序
        for(int i = 0 ; i < N ; i ++){
            int pos = (int) (Math.random() * (i+1));
            Integer t = arr[pos];
            arr[pos] = arr[i];
            arr[i] = t;
        }

        BST<Integer,String> bst = new BST<Integer,String>();
        for(int i = 0 ; i < N ; i ++)
            bst.insert(new Integer(arr[i]), Integer.toString(arr[i]));
    }
}
