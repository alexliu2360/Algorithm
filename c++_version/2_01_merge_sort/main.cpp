//
// Created by alexliu on 18-7-30.
//
#include <iostream>
#include "SortTestHelper.h"
#include "n2sort.h"


using namespace std;

template<typename T>
void __merge(T arr[], int l, int mid, int r) {
//    T aux[r-l+1];
    T *aux = new T[r - l + 1];
    for (int i = l; i <= r; i++) {
        aux[i - l] = arr[i];
    }

    // i指向左半部分的起始索引位置l;ｊ=mid+1的目的是因为数组是从0开始的，所以mid=(n-1)/2，而不是n/2
    int i = l, j = mid+1;
    for (int k = l; k <= r; k++) {
        if (i > mid) {  //左半部分已经排序完毕，将右半部分的地方都赋值给arr
            arr[k] = aux[j - l];
            j++;
        } else if (j > r) {  //右半部分已经排序完毕，将左半部分的地方都赋值给arr
            arr[k] = aux[i - l];
            i++;
        } else if (aux[i - l] < aux[j - l]) {  //左半部分<右半部分
            arr[k] = aux[i - l];
            i++;
        } else {  //左半部分>右半部分
            arr[k] = aux[j - l];
            j++;
        }
    }
    delete[] aux;
}


// 递归使用并归排序　arr[l, r]　双闭区间
template<typename T>
void __mergeSort(T arr[], int l, int r) {
    if (l >= r)
        return;

    int mid = (l + r) / 2;

    //递归使用
    __mergeSort(arr, l, mid);
    __mergeSort(arr, mid + 1, r);
    __merge(arr, l, mid, r);
}

template<typename T>
void mergeSort(T arr[], int n) {
    __mergeSort(arr, 0, n - 1);
}

int main() {
    int n = 100000;
    //整形数组
//    int *arr1 = SortTestHelper::generateRandomArray(n, 0, n);
//    int *arr2 = SortTestHelper::copyIntArray(arr1, n);
//    SortTestHelper::testSort("merge sort", mergeSort, arr1, n);
//    SortTestHelper::testSort("insertion sort", insertionSort, arr2, n);
//    delete[] arr1;
//    delete[] arr2;

    int *arr1 = SortTestHelper::generateNearlyOrderedArray(n, 23);
    int *arr2 = SortTestHelper::copyIntArray(arr1, n);
    SortTestHelper::testSort("merge sort", mergeSort, arr1, n);
    SortTestHelper::testSort("insertion sort", insertionSort, arr2, n);
    delete[] arr1;
    delete[] arr2;

    return 0;
}