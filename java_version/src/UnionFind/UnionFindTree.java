package UnionFind;
import Utils.UnionFindTestHelper;
public class UnionFindTree {

    private int count;
    private int[] parent;

    public UnionFindTree(int n) {
        count = n;
        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    private int find(int p) {
        assert p >= 0 && p < count;

        while (p != parent[p])
            p = parent[p];

        return p;
    }

    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    public void unionElements(int p, int q){
        int qRoot = find(q);
        int pRoot = find(p);

        if(qRoot == pRoot)
            return;

        parent[pRoot] = qRoot;
    }

    public static void main(String[] args){
        UnionFindTestHelper.testUF2(10);
    }
}
