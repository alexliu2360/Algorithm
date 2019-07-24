package Sort;

import java.util.Arrays;

import Util.SortTestHelper;

public class MainTest {



    public static  void main(String[] args){

        int N = 100000;
        boolean isSelection = true;
        boolean isInsertion = true;
        boolean isBubble = true;
        boolean isMerge = true;
        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");

        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
//        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr4 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr5 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr6 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr7 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr8 = Arrays.copyOf(arr1, arr1.length);
//        SortTestHelper.testSort("Sort.Selection.SelectionSortUsingCompare", arr1, isSelection);
//        SortTestHelper.testSort("Sort.Selection.SelectionSortOptimized", arr2, isSelection);
//        SortTestHelper.testSort("Sort.Insertion.InsertionSort", arr3, isInsertion);
//        SortTestHelper.testSort("Sort.Insertion.InsertionSortOptimized", arr4, isInsertion);
//        SortTestHelper.testSort("Sort.Insertion.InsertionShellSort", arr5, isInsertion);
        SortTestHelper.testSort("Sort.Quick.QuickSort", arr1, isInsertion);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSort", arr6, isBubble);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSortOptimized", arr7, isBubble);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSortOptimized2", arr8, isBubble);

        System.out.println("-------------");

        System.out.println("Test for more ordered random array, size = " + N + " , random range [0,3]");

        arr1 = SortTestHelper.generateRandomArray(N, 0, 3);
//        arr2 = Arrays.copyOf(arr1, arr1.length);
//        arr3 = Arrays.copyOf(arr1, arr1.length);
//        arr4 = Arrays.copyOf(arr1, arr1.length);
//        arr5 = Arrays.copyOf(arr1, arr1.length);
//        arr6 = Arrays.copyOf(arr1, arr1.length);
//        arr7 = Arrays.copyOf(arr1, arr1.length);
//        arr8 = Arrays.copyOf(arr1, arr1.length);
//        SortTestHelper.testSort("Sort.Selection.SelectionSortUsingCompare", arr1, isSelection);
//        SortTestHelper.testSort("Sort.Selection.SelectionSortOptimized", arr2, isSelection);
//        SortTestHelper.testSort("Sort.Insertion.InsertionSort", arr3, isInsertion);
//        SortTestHelper.testSort("Sort.Insertion.InsertionSortOptimized", arr4, isInsertion);
//        SortTestHelper.testSort("Sort.Insertion.InsertionShellSort", arr5, isInsertion);
//        SortTestHelper.testSort("Sort.Quick.QuickSort", arr1, isInsertion);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSort", arr6, isBubble);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSortOptimized", arr7, isBubble);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSortOptimized2", arr8, isBubble);
        System.out.println("-------------");

        int swapTimes = 5;

        System.out.println("Test for nearly ordered random array, size = " + N + " , random range [0, " + N + "]" + ", swap time = " + swapTimes);
        arr1 = SortTestHelper.generateNearlyOrderedArray(N, swapTimes);
//        arr2 = Arrays.copyOf(arr1, arr1.length);
//        arr3 = Arrays.copyOf(arr1, arr1.length);
//        arr4 = Arrays.copyOf(arr1, arr1.length);
//        arr5 = Arrays.copyOf(arr1, arr1.length);
//        arr6 = Arrays.copyOf(arr1, arr1.length);
//        arr7 = Arrays.copyOf(arr1, arr1.length);
//        arr8 = Arrays.copyOf(arr1, arr1.length);
//        SortTestHelper.testSort("Sort.Selection.SelectionSortUsingCompare", arr1, isSelection);
//        SortTestHelper.testSort("Sort.Selection.SelectionSortOptimized", arr2, isSelection);
//        SortTestHelper.testSort("Sort.Insertion.InsertionSort", arr3, isInsertion);
//        SortTestHelper.testSort("Sort.Insertion.InsertionSortOptimized", arr4, isInsertion);
//        SortTestHelper.testSort("Sort.Insertion.InsertionShellSort", arr5, isInsertion);
//        SortTestHelper.testSort("Sort.Quick.QuickSort", arr1, isInsertion);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSort", arr6, isBubble);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSortOptimized", arr7, isBubble);
//        SortTestHelper.testSort("Sort.Bubble.BubbleSortOptimized2", arr8, isBubble);
    }
}
