package UnionFind;

import Utils.UnionFindTestHelper;

public class UnionFindTreeRankOptimized {

    private int count;
    private int[] parent;
    private int[] rank;

    public UnionFindTreeRankOptimized(int n) {
        count = n;
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
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

        if (pRoot == qRoot)
            return;

        if (rank[pRoot] < rank[qRoot]) {
            parent[pRoot] = qRoot;
        } else if (rank[pRoot] > rank[qRoot]) {
            parent[qRoot] = pRoot;
        } else {
            parent[pRoot] = qRoot;
            rank[pRoot] += 1;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        UnionFindTestHelper.testUF4(n);
    }
}
