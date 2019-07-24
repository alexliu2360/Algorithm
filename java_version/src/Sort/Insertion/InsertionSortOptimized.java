package Sort.Insertion;

public class InsertionSortOptimized {

    private InsertionSortOptimized(){};

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            Comparable e = arr[i];
            int j = i;
            // 由于在[0:i-1]的区间里都是排号序的，因此只要在这个区间里找到比e小的即可退出，交换e和该位置的值
            for(;j > 0 && e.compareTo(arr[j-1])<0;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = e;
        }
    }
    // 对arr[l...r]的区间使用InsertionSort排序
    public static void sort(Comparable[] arr, int l, int r){

        for( int i = l + 1 ; i <= r ; i ++ ){
            Comparable e = arr[i];
            int j = i;
            for( ; j > l && arr[j-1].compareTo(e) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = e;
        }
    }
    public static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        Integer[] arr = {10,9,8,7,6,5,4,3,2,1};
        InsertionSortOptimized.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

}
