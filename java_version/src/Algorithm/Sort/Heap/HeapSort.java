package Algorithm.Sort.Heap;

import Utils.SortTestHelper;

public class HeapSort {


    private HeapSort(){}

    /*
    * 从0开始计数 0 1 2 3 ...
    * parent(i) = (i-1)/2
    * left(i) = 2*i+1
    * right(i) = 2*i+2
    *
    *
    * 从1开始计数 - 1 2 3 ...
    * parent(i) = i/2
    * left(i) = 2*i
    * right(i) = 2*i+1
    * */

    public static void sort(Comparable[] arr){
        int n = arr.length;

        for( int i = (n-1-1)/2 ; i >= 0 ; i -- )
            shiftDown(arr, n, i);

        for( int i = n-1; i > 0 ; i-- ){
            swap( arr, 0, i);
            shiftDown(arr, i, 0);
        }
    }

    public static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static void shiftDown(Comparable[] arr, int len, int index){

        Comparable e = arr[index];
        while (index*2+1 < len ){
            int j = index * 2+1;
            if(j+1<len && arr[j].compareTo(arr[j+1])<0)
                j++;
            if(e.compareTo(arr[j]) > 0)
                break;

            arr[index] = arr[j];
            index = j;
        }

        arr[index] = e;

    }

    public static void main(String[] args){
        int N = 10;
//        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 1000000);
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 20);
//        Integer[] arr = SortTestHelper.generateNearlyOrderedArray(N, 5);

        SortTestHelper.testSort("Sort.Heap.HeapSort", arr, true);
    }
}
