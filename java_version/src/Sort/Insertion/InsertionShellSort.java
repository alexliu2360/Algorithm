package Sort.Insertion;

import Utils.SortTestHelper;

// Shell排序又称作缩小增量排序
public class InsertionShellSort {

    private InsertionShellSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;

        // 计算 increment sequence: 1, 4, 13, 40, 121, 364, 1093...
        int h = 1;
        while (h < n/3) h = 3*h + 1;

        while (h >= 1) {

            // h-sort the array
            for (int i = h; i < n; i++) {

                // 对 arr[i], arr[i-h], arr[i-2*h], arr[i-3*h]... 使用插入排序
                Comparable e = arr[i];
                int j = i;
                for ( ; j >= h && e.compareTo(arr[j-h]) < 0 ; j -= h)
                    arr[j] = arr[j-h];
                arr[j] = e;
            }

            h /= 3;
        }
    }

    public static void main(String[] args){
        int N = 1000000;

        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");

        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        SortTestHelper.testSort("InsertionShellSort", arr1, true);

        System.out.println("-------------");

        System.out.println("Test for more ordered random array, size = " + N + " , random range [0,3]");

        arr1 = SortTestHelper.generateRandomArray(N, 0, 3);
        SortTestHelper.testSort("InsertionShellSort", arr1, true);

        System.out.println("-------------");

        int swapTimes = 5;

        System.out.println("Test for nearly ordered random array, size = " + N + " , random range [0, " + N + "]" + ", swap time = " + swapTimes);
        arr1 = SortTestHelper.generateNearlyOrderedArray(N, swapTimes);
        SortTestHelper.testSort("InsertionShellSort", arr1, true);
    }
}
