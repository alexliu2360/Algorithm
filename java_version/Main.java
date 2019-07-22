import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static  void main(String[] args){

        int N = 10000;

        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");

        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);

        SortTestHelper.testSort("SelectionSortUsingCompare", arr1);
        SortTestHelper.testSort("InsertionSort", arr2);
        SortTestHelper.testSort("InsertionSortOptimized", arr3);

        System.out.println("-------------");

        System.out.println("Test for more ordered random array, size = " + N + " , random range [0,3]");

        arr1 = SortTestHelper.generateRandomArray(N, 0, 3);
        arr2 = Arrays.copyOf(arr1, arr1.length);
        arr3 = Arrays.copyOf(arr1, arr1.length);

        SortTestHelper.testSort("SelectionSortUsingCompare", arr1);
        SortTestHelper.testSort("InsertionSort", arr2);
        SortTestHelper.testSort("InsertionSortOptimized", arr3);

        System.out.println("-------------");

        int swapTimes = 5;

        System.out.println("Test for nearly ordered random array, size = " + N + " , random range [0, " + N + "]" + ", swap time = " + swapTimes);
        arr1 = SortTestHelper.generateNearlyOrderedArray(N, swapTimes);
        arr2 = Arrays.copyOf(arr1, arr1.length);
        arr3 = Arrays.copyOf(arr1, arr1.length);

        SortTestHelper.testSort("SelectionSortUsingCompare", arr1);
        SortTestHelper.testSort("InsertionSort", arr2);
        SortTestHelper.testSort("InsertionSortOptimized", arr3);
    }
}
