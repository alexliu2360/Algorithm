package Sort.Heap;

import Heap.MaxHeap;
import Utils.SortTestHelper;

public class HeapSortBasic {

    private HeapSortBasic(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        MaxHeap maxHeap = new MaxHeap(n);

        for(int i = 0;i<n;i++)
            maxHeap.insert(arr[i]);

        for(int i = n - 1;i >= 0;i--)
            arr[i] = maxHeap.extractMax();
    }

    public static void main(String[] args){
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 1000000);

        SortTestHelper.testSort("Sort.Heap.HeapSortBasic", arr, true);
    }

}
