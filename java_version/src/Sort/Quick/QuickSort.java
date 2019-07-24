package Sort.Quick;
import Util.SortTestHelper;
public class QuickSort {

    private QuickSort(){}

    public static int partion(Comparable[] arr, int l, int r){
        /*
        @params:
        @returns: pivotIndex
        arr[l, pivotIndex-1] < e
        arr[pivotIndex+1, r] > e
         */
        Comparable e = arr[l];
        int pivotIndex = l;
        for(int i = l+1;i<=r;i++){
            if(arr[i].compareTo(e)<0){
                pivotIndex++;
                swap(arr,i, pivotIndex);
            }
        }
        swap(arr, l, pivotIndex);

        return pivotIndex;
    }

    public static void sort(Comparable[] arr, int l, int r){

        if(l >= r)
            return;

        int pivot = partion(arr, l, r);

        sort(arr, l, pivot-1);

        sort(arr, pivot+1, r);
    }

    public static void sort(Comparable[] arr){

        int n = arr.length;

        sort(arr, 0, n-1);
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // 测试 QuickSort
    public static void main(String[] args) {

        // Quick Sort也是一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
//        SortTestHelper.printArray(arr);
        SortTestHelper.testSort("Sort.Quick.QuickSort", arr, true);
//        SortTestHelper.printArray(arr);
        return;
    }
}
