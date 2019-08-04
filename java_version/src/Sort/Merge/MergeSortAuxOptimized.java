package Sort.Merge;
import Sort.Insertion.InsertionSortOptimized;
import Utils.SortTestHelper;

import java.util.Arrays;

// todo：一次性分配空间
public class MergeSortAuxOptimized {

    private MergeSortAuxOptimized(){}

    public static void merge(Comparable[] arr, int l,int mid, int r){
        Comparable[] aux = Arrays.copyOfRange(arr, l, r+1); // [l , r]

        int leftIndex = l, rightIndex = mid+1;
        for (int curIndex = l;curIndex <= r;curIndex++){
            if(leftIndex > mid){
                arr[curIndex] = aux[rightIndex - l];
                rightIndex ++;
            } else if (rightIndex > r) {
                arr[curIndex] = aux[leftIndex - l];
                leftIndex ++;
            } else if (aux[leftIndex - l].compareTo(aux[rightIndex - l]) < 0){
                arr[curIndex] = aux[leftIndex - l];
                leftIndex ++;
            } else {
                arr[curIndex] = aux[rightIndex - l];
                rightIndex ++;
            }
        }
    }

    public static void sort(Comparable[] arr, int l, int r){

        // todo:r-l到底多少比较合适？
        if(r - l <= 20) {
            InsertionSortOptimized.sort(arr, l, r);
            return;
        }

        int mid = (r+l)/2;

        sort(arr, l, mid);
        sort(arr, mid+1, r);

        if(arr[mid].compareTo(arr[mid+1]) > 0)
            merge(arr, l, mid, r);
    }

    public static void sort(Comparable[] arr){
        int n = arr.length;
        sort(arr, 0, n-1);
    }

    public static void main(String[] args){
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, N);
//        SortTestHelper.printArray(arr);
//        SortTestHelper.testSort("sort.merge.MergeSortOptimized", arr, true);
//        SortTestHelper.printArray(arr);

//        Integer[] arr = SortTestHelper.generateNearlyOrderedArray(N,5);
        Integer[] arr1 = Arrays.copyOf(arr,arr.length);
        SortTestHelper.testSort("Sort.Merge.MergeSort", arr, true);
        SortTestHelper.testSort("Sort.Merge.MergeSortOptimized", arr1, true);
        return;
    }
}
