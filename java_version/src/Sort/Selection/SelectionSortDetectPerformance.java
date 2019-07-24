package Sort.Selection;

import Util.SortTestHelper;

public class SelectionSortDetectPerformance {
    private SelectionSortDetectPerformance() {}

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j].compareTo(arr[minIndex])<0)
                    minIndex = j;
            swap(arr, i, minIndex);
        }
    }

    public static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {

        // 测试排序算法辅助函数
        int N = 200000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("SelectionSortDetectPerformance", arr, true);

        return;
    }
}
