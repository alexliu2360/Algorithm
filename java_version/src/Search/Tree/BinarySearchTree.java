package Search.Tree;

import Search.Binary.BinarySearch;
import Utils.FileOp;
import org.omg.CORBA.NO_IMPLEMENT;

import java.awt.geom.NoninvertibleTransformException;
import java.awt.print.PrinterGraphics;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;


public class BinarySearchTree<Key extends Comparable<Key>, Value> {

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

    public BinarySearchTree() {
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

    public Value search(Key key){
        return search(root, key);
    }

    public boolean contain(Key key){
        return contain(root, key);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void postOrder(){
        postOrder(root);
    }

    public void levelOrder(){
        // 我们使用LinkedList来作为我们的队列
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while( !q.isEmpty() ){

            Node node = q.remove();

            System.out.println(node.key);

            if( node.left != null )
                q.add( node.left );
            if( node.right != null )
                q.add( node.right );
        }
    }

    public Key minimum(){
        assert count != 0;
        Node node = minimum(root);
        return node.key;
    }

    public Key maximum(){
        assert count != 0;
        Node node = maximum(root);
        return node.key;
    }

    public void removeMin(){
        if(root!=null)
            root = removeMin(root);
    }

    public void removeMax(){
        if(root!=null)
            root = removeMax(root);
    }

    public void remove(Key key){
        root = remove(root, key);
    }
    private Node insert(Node node, Key key, Value value) {
        if(node == null){
            count++;
            return new Node(key, value);
        }

        if(key.compareTo(node.key)<0){
            node.left = insert(node.left, key, value);
        } else if (key.compareTo(node.key) > 0){
            node.right = insert(node.right, key, value);
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

    private void preOrder(Node node){
        if (node != null){
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    private void inOrder(Node node){
        if (node != null){
            inOrder(node.left);
            System.out.println(node.key);
            inOrder(node.right);
        }
    }

    private void postOrder(Node node){
        if (node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.key);
        }
    }

    private boolean contain(Node node, Key key){
        if(node==null)
            return false;

        if(key.compareTo(node.key)<0){
            return contain(node.left, key);
        } else if(key.compareTo(node.key)>0) {
            return contain(node.right, key);
        } else {
            return true;
        }
    }

    private Node minimum(Node node){
        if(node.left == null)
            return node;

        return minimum(node.left);
    }

    private Node maximum(Node node){
        if(node.right == null)
            return node;

        return maximum(node.right);
    }

    private Node removeMin(Node node){
        if(node.left == null){
            Node rightNode = node.right;
            node.right = null;
            count--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    private Node removeMax(Node node){
        if(node.right == null){
            Node leftNode = node.left;
            node.left = null;
            count--;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    private Node remove(Node node, Key key){
        if(node == null)
            return null;

        if(key.compareTo(node.key)<0){
            node.left = remove(node.left, key);
            return node;
        } else if(key.compareTo(node.key)>0){
            node.right = remove(node.right, key);
            return node;
        } else {
            //left = null
            if(node.left == null){
                Node rightNode = node.right;
                node.right = null;
                count --;
                return rightNode;
            }

            // right = null
            if(node.right == null){
                Node leftNode = node.left;
                node.left = null;
                count --;
                return leftNode;
            }
        }

    }

    public static void main(String[] args) {


//        int N = 1000000;
//
//        // 创建一个数组，包含[0...N)的所有元素
//        Integer[] arr = new Integer[N];
//        for(int i = 0 ; i < N ; i ++)
//            arr[i] = new Integer(i);
//
//        // 打乱数组顺序
//        for(int i = 0 ; i < N ; i ++){
//            int pos = (int) (Math.random() * (i+1));
//            Integer t = arr[pos];
//            arr[pos] = arr[i];
//            arr[i] = t;
//        }
//
        BinarySearchTree<Integer,String> bst = new BinarySearchTree<Integer,String>();
//        for(int i = 0 ; i < N ; i ++)
//            bst.insert(new Integer(arr[i]), Integer.toString(arr[i]));
//
//        for(int i = 0 ; i < 2*N ; i ++){
//            String res = bst.search(new Integer(i));
//            if( i < N )
//                assert res.equals(Integer.toString(i));
//            else
//                assert res == null;
//        }

//        String filename = "/home/alexliu-ubuntu/Documents/code/ex/imooc/liuyubo/algorithm/Algorithm/java_version/src/Search/Tree/bible.txt";
//
//        Vector<String> words = new Vector<String>();
//        if(FileOp.readFile(filename, words)){
//            System.out.println( "There are totally " + words.size() + " words in " + filename );
//            System.out.println();
//
//            long startTime = System.currentTimeMillis();
//            BST<String, Integer> bst = new BST<String, Integer>();
//
//            for (String word: words) {
//                Integer res = bst.search(word);
//                if (res == null)
//                    bst.insert(word, new Integer(1));
//                else
//                    bst.insert(word, res + 1);
//            }
//
//        if( bst.contain("god") )
//            System.out.println("'god' : " + bst.search("god") );
//        else
//            System.out.println("No word 'god' in " + filename);
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("BST , using time: " + (endTime - startTime) + "ms.");
//
//        System.out.println();
//        **/
//
//        BinarySearchTree<Integer, Integer> bst = new BinarySearchTree<Integer, Integer>();
//
//        int N = 10;
//        int M = 100;
//        for(int i = 0 ; i < N ; i ++){
//            Integer key = new Integer((int)(Math.random()*M));
//            // 为了后续测试方便,这里value值取和key值一样
//            bst.insert(key, key);
//            System.out.print(key + " ");
//        }
//
//        System.out.println();

        // 测试二分搜索树的size()
        System.out.println("size: " + bst.size());
        System.out.println();
        /*
        // 测试二分搜索树的前序遍历 preOrder
        System.out.println("preOrder: ");
        bst.preOrder();
        System.out.println();

        // 测试二分搜索树的中序遍历 inOrder
        System.out.println("inOrder: ");
        bst.inOrder();
        System.out.println();

        // 测试二分搜索树的后序遍历 postOrder
        System.out.println("postOrder: ");
        bst.postOrder();
        System.out.println();

        // 测试二分搜索树的层序遍历 levelOrder
        System.out.println("levelOrder: ");
        bst.levelOrder();
        System.out.println();
        */
        System.out.println("minimum: ");
        System.out.println(bst.minimum());
        System.out.println();

        System.out.println("maximum: ");
        System.out.println(bst.maximum());
        System.out.println();

        System.out.println("removeMin: ");
        bst.removeMin();
        bst.inOrder();
        System.out.println();

        System.out.println("removeMax: ");
        bst.removeMax();
        bst.inOrder();
        System.out.println();
    }
}
