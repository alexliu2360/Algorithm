//
// Created by alexliu on 18-8-4.
//

#ifndef PLAYALGORITHM_MERGESORT_H
#define PLAYALGORITHM_MERGESORT_H

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
    int i = l, j = mid + 1;
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

/*----------------------------mergeSort-------------------------
 * */

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

/*----------------------------advancedMergeSort-------------------------
 * */
template<typename T>
void __advancedMergeSort(T arr[], int l, int r) {
    //　优化２：使用插入排序对近乎有序的数组进行排序，提高效率
    if (r - l <= 16) {
        insertionSortAdvanced2(arr, l, r);
        return;
    }

    int mid = (l + r) / 2;

    __advancedMergeSort(arr, l, mid);
    __advancedMergeSort(arr, mid + 1, r);

    // 优化１：当左边大于右边的时候才需要排序
    if (arr[mid] > arr[mid + 1])
        __merge(arr, l, mid, r);
}

template<typename T>
void advancedMergeSort(T arr[], int n) {
    __advancedMergeSort(arr, 0, n - 1);
}


#endif //PLAYALGORITHM_MERGESORT_H
