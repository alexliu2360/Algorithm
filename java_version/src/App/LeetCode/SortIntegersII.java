package App.LeetCode;

/*
*
给一组整数，按照升序排序。使用归并排序，快速排序，堆排序或者任何其他 O(n log n) 的排序算法。
Example

例1：

输入：[3,2,1,4,5]，
输出：[1,2,3,4,5]。

例2：

输入：[2,3,1]，
输出：[1,2,3]。


* */

public class SortIntegersII {
    public void test() {
        int[] arr = {5,2,3,4,1};
        Solution s = new Solution();
        s.sortIntegers2(arr);
        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public int partition(int[] arr, int l, int r) {

        int v = arr[l];

        int j = l; // arr[l+1...j] < v ; arr[j+1...i) > v
        for (int i = l + 1; i <= r; i++)
            if (arr[i] < v) {
                j++;
                swap(arr, j, i);
            }

        swap(arr, l, j);

        return j;
    }

    // 递归使用快速排序,对arr[l...r]的范围进行排序
    public void sort(int[] arr, int l, int r) {

        if (l >= r)
            return;

        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    public void sort(int[] arr) {

        int n = arr.length;
        sort(arr, 0, n - 1);
    }

    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public class Solution {
        /**
         * @param A: an integer array
         * @return: nothing
         */
        public void sortIntegers2(int[] A) {
            sort(A);
        }
    }

}
