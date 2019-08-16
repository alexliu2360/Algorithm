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

    static int floor(Comparable[] arr, Comparable target){

        // 寻找比target小的最大索引
        int l = -1, r =     arr.length-1;
        while( l < r ){
            // 使用向上取整避免死循环
            int mid = l + (r-l+1)/2;
            if( arr[mid].compareTo(target) >= 0 )
                r = mid - 1;
            else
                l = mid;
        }

        assert l == r;

        // 如果该索引+1就是target本身, 该索引+1即为返回值
        if( l + 1 < arr.length && arr[l+1] == target )
            return l + 1;

        // 否则, 该索引即为返回值
        return l;
    }


    // 二分查找法, 在有序数组arr中, 查找target
    // 如果找到target, 返回最后一个target相应的索引index
    // 如果没有找到target, 返回比target大的最小值相应的索引, 如果这个最小值有多个, 返回最小的索引
    // 如果这个target比整个数组的最大元素值还要大, 则不存在这个target的ceil值, 返回整个数组元素个数n
    static int ceil(Comparable[] arr, Comparable target){

        // 寻找比target大的最小索引值
        int l = 0, r = arr.length;
        while( l < r ){
            // 使用普通的向下取整即可避免死循环
            int mid = l + (r-l)/2;
            if( arr[mid].compareTo(target) <= 0 )
                l = mid + 1;
            else // arr[mid] > target
                r = mid;
        }

        assert l == r;

        // 如果该索引-1就是target本身, 该索引+1即为返回值
        if( r - 1 >= 0 && arr[r-1] == target )
            return r-1;

        // 否则, 该索引即为返回值
        return r;
    }

    public static void main(String[] args){

//        int N = 10000000;
//        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, N*10);
//        SortTestHelper.testSort("Sort.Quick.QuickSort3Ways", arr, true);
//
//        int testNum = arr[(int)(Math.random() * N)];
//        System.out.println("test num is "+testNum);
//
//        long startTime = System.currentTimeMillis();
//        int index = BinarySearch.search(arr, testNum);
//        long endTime = System.currentTimeMillis();
//        System.out.println("return num is "+arr[index]);
//        System.out.println("using " + (endTime-startTime) + " ms");
//
//
//        System.out.println("--------------");
//
//        startTime = System.currentTimeMillis();
//        index = BinarySearchRecursion.search(arr, testNum);
//        endTime = System.currentTimeMillis();
//        System.out.println("return num is "+arr[index]);
//        System.out.println("using " + (endTime-startTime) + " ms");

//        for(int i = 0 ; i < 2*N ; i ++) {
//            int v = BinarySearchRecursion.search(arr, new Integer(i));
//            if (i < N)
//                assert v == i;
//            else
//                assert v == -1;
//        }

        Integer arr[] = new Integer[]{1, 1, 1, 2, 2, 2, 2, 2, 4, 4, 5, 5, 5, 6, 6, 6};
        for( int i = 0 ; i <= 8 ; i ++ ){

            int floorIndex = floor(arr, i);
            System.out.println("the floor index of " + i + " is " + floorIndex + ".");
            if( floorIndex >= 0 && floorIndex < arr.length )
                System.out.println("The value is " + arr[floorIndex] + ".");
            System.out.println();

            int ceilIndex = ceil(arr, i);
            System.out.println("the ceil index of " + i + " is " + ceilIndex + ".");
            if( ceilIndex >= 0 && ceilIndex < arr.length )
                System.out.println("The value is " + arr[ceilIndex] + ".");
            System.out.println();

            System.out.println();
        }
    }
}
