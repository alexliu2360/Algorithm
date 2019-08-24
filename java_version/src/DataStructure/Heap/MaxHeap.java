package DataStructure.Heap;


/*
1. 堆中某个节点的值总是不大于其父节点的值
2. 堆总是一棵完全二叉树
*/
public class MaxHeap<Item extends Comparable> {

    protected Item[] data;
    protected int count;
    protected int capacity;

    public MaxHeap(int capacity) {
        // 构建函数 从data[1]开始存数
        data = (Item[]) new Comparable[capacity + 1];
        count = 0;
        this.capacity = capacity;
    }

    public MaxHeap(Item[] arr) {
        // 构建函数 从data[1]开始存数

        int n = arr.length;
        data = (Item[])new Comparable[n+1];
        capacity = n;
        for(int i = 0;i<n;i++)
            data[i+1] = arr[i];

        count = n;
        for(int i = n/2;i>=1;i--)
            shiftDown(i);

    }

    public int size() {
        return count;
    }

    public Item getMax() {
        assert (count > 0);
        return data[1];
    }

    public void shiftDown(int index) {

        while (index * 2 <= count) {
            int j = index * 2;
            if (j + 1 <= count && data[j].compareTo(data[j + 1]) < 0)
                j++;
            if (data[j].compareTo(data[index]) < 0)
                break;
            swap(j, index);
            index = j;
        }

    }

    public void insert(Item item) {
        assert count + 1 <= capacity;

        data[count + 1] = item;
        count++;
        shiftUp(count);

    }

    private void shiftUp(int k) {

        while (k > 1 && data[k / 2].compareTo(data[k]) < 0) {
            swap(k / 2, k);
            k /= 2;
        }
    }

    private void swap(int i, int j) {
        Item t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Item extractMax() {
        assert count > 0;
        Item ret = data[1];

        swap(1, count);
        count--;
        shiftDown(1);
        return ret;
    }

    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(100);
        int N = 50;
        int M = 100;

        for (int i = 0; i < N; i++) {
            maxHeap.insert(new Integer((int) (Math.random() * M)));
        }
        for (int i = 0; i < N; i++) {
            System.out.println(maxHeap.extractMax());
        }

        System.out.println(maxHeap.size());
    }

}
