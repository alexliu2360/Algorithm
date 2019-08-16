package UnionFind;

import Utils.UnionFindTestHelper;

public class UnionFindId {

    private int[] id;
    private int count;

    public UnionFindId(int n){
        count = n;
        id = new int[n];
        for(int i=0;i<n;i++){
            id[i] = i;
        }
    }

    private int find(int p){
        assert p>=0 && p<count;
        return id[p];
    }

    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    public void unionElements(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID)
            return;

        // 合并过程需要遍历一遍所有元素, 将两个元素的所属集合编号合并
        for (int i = 0; i < count; i++)
            if (id[i] == pID)
                id[i] = qID;
    }

    public static void main(String[] args) {

        // 使用10000的数据规模
        int n = 10000;

        // 虽然isConnected只需要O(1)的时间, 但由于union操作需要O(n)的时间
        // 总体测试过程的算法复杂度是O(n^2)的
        UnionFindTestHelper.testUF1(n);
    }
}
