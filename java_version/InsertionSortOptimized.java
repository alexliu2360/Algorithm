
public class InsertionSortOptimized {

    private InsertionSortOptimized(){};

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            Comparable e = arr[i];
            int j = i;
            for(;j > 0 && arr[j].compareTo(arr[j-1])>0;j--){
                arr[j] = arr[j-1];
            }
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
