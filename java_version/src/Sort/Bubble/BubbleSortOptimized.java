package Sort.Bubble;

public class BubbleSortOptimized {

    private BubbleSortOptimized() {
    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        boolean isSorted = false;
        for (int i = 0; i < n - 1; i++) {
            isSorted = true;
            for (int j = n - 1; j > i; j--) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    swap(arr, j, j - 1);
                    isSorted=false;
                }
            }
            if(isSorted)
                break;
        }
    }

    public static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSortOptimized.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}

