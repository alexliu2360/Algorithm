package Sort.Merge;
import Util.SortTestHelper;

import java.util.Arrays;

public class MergeSort {

    private MergeSort(){}

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
        if(l >= r)
            return;

        int mid = (r+l)/2;

        sort(arr, l, mid);
        sort(arr, mid+1, r);
        merge(arr, l, mid, r);

    }

    public static void sort(Comparable[] arr){
        int n = arr.length;
        sort(arr, 0, n-1);
    }

    public static void main(String[] args){
        int N = 10;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
        SortTestHelper.printArray(arr);
        SortTestHelper.testSort("Sort.Merge.MergeSort", arr, true);
        SortTestHelper.printArray(arr);
        return;
    }
}
