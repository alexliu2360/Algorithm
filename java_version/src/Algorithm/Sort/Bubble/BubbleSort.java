package Algorithm.Sort.Bubble;

public class BubbleSort {

    private BubbleSort(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0;i < n-1;i++){
            for(int j = n-1;j > 0;j--){
                if(arr[j].compareTo(arr[j-1])<0)
                    swap(arr,j, j-1);
            }
        }
    }

    public static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {

//        Integer[] arr = {10,9,8,7,6,5,4,3,2,1};
        Integer[] arr = {10,9,8,4,3,2,1,7,6,5};
        BubbleSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
