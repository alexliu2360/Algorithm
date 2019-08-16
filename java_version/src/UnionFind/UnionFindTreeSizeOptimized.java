package UnionFind;

import Utils.UnionFindTestHelper;

public class UnionFindTreeSizeOptimized {

    private int count;
    private int[] parent;
    private int[] sz;

    public UnionFindTreeSizeOptimized(int n) {
        count = n;
        parent = new int[n];
        sz = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            sz[i] = 1;
        }
    }

    private int find(int p) {
        assert p >= 0 & p < count;

        while (p != parent[p])
            p = parent[p];

        return p;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    // 根据size大小判断合并方向,进行优化
    // 将size比较小的合并到size比较大的部分
    public void unionElements(int p, int q) {
        int pRoot = parent[p];
        int qRoot = parent[q];

        if(pRoot == qRoot)
            return;

        if(sz[pRoot]<sz[qRoot]){
            parent[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        } else {
            parent[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
    }

    public static void main(String[] args){
        int n = 10;
        UnionFindTestHelper.testUF3(n);
    }
}
