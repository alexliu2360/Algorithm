package Search.Binary;

import Utils.SortTestHelper;


public class BinarySearchRecursion {

    private BinarySearchRecursion(){}

    public static int _serach(Comparable[] arr, int l, int r, Comparable target){
        if(l > r)
            return -1;

        int mid = l + (r - l) / 2;

        if(target.compareTo(arr[mid])<0){
            return _serach(arr, l, mid-1, target);
        } else if(target.compareTo(arr[mid])>0){
            return _serach(arr, mid+1, r, target);
        } else {
            return mid;
        }
    }

    public static int search(Comparable[] arr, Comparable target){
        return _serach(arr, 0, arr.length-1, target);
    }

    public static void main(String[] args){

        int N = 10000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, N*10);
        SortTestHelper.testSort("Sort.Quick.QuickSort3Ways", arr, true);

        int testNum = arr[(int)(Math.random() * N)];
        System.out.println("test num is "+testNum);

        long startTime = System.currentTimeMillis();
        int index = BinarySearch.search(arr, testNum);
        long endTime = System.currentTimeMillis();
        System.out.println("return num is "+arr[index]);
        System.out.println("using " + (endTime-startTime) + " ms");


        System.out.println("--------------");

        startTime = System.currentTimeMillis();
        index = BinarySearchRecursion.search(arr, testNum);
        endTime = System.currentTimeMillis();
        System.out.println("return num is "+arr[index]);
        System.out.println("using " + (endTime-startTime) + " ms");

//        for(int i = 0 ; i < 2*N ; i ++) {
//            int v = BinarySearchRecursion.search(arr, new Integer(i));
//            if (i < N)
//                assert v == i;
//            else
//                assert v == -1;
//        }

        return;
    }
}
