package Algorithm.Sort.Merge;
import Algorithm.Sort.Insertion.InsertionSortOptimized;

public class MergeSortBU {

    private MergeSortBU(){}


    public static void merge(Comparable[] arr, int l, int mid, int r){

    }

    public static void sort(Comparable[] arr){
        int n = arr.length;

        for(int i = 0;i<n;i+=16){
            InsertionSortOptimized.sort(arr, i, Math.min(i+15, n-1));
        }

        for(int size = 16;size<n;size+=16){
            // todo
        }
    }


    public static void main(String[] args){
        int N = 10;
//        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
//        SortTestHelper.printArray(arr);
//        SortTestHelper.testSort("sort.merge.MergeSort", arr, true);
//        SortTestHelper.printArray(arr);
        return;
    }
}
