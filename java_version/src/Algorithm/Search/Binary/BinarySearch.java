package Algorithm.Search.Binary;

public class BinarySearch {

    private BinarySearch(){}

    public static int search(Comparable[] arr, Comparable target){
        int l = 0, r = arr.length-1;
        while (l <= r){
            int mid = l + (r-l)/2;

            if(target.compareTo(arr[mid])<0){
                r = mid - 1;
            } else if (target.compareTo(arr[mid])>0){
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int N = 1000000;
        Integer[] arr = new Integer[N];
        for(int i = 0 ; i < N ; i ++)
            arr[i] = new Integer(i);

        // 对于我们的待查找数组[0...N)
        // 对[0...N)区间的数值使用二分查找，最终结果应该就是数字本身
        // 对[N...2*N)区间的数值使用二分查找，因为这些数字不在arr中，结果为-1
        for(int i = 0 ; i < 2*N ; i ++) {
            int v = BinarySearch.search(arr, new Integer(i));
            if (i < N)
                assert v == i;
            else
                assert v == -1;
        }

        return;
    }
}
