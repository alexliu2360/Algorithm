//
// Created by alexliu on 18-7-30.
//

#include <iostream>
#include "SortTestHelper.h"

using namespace std;

template<typename T>
void selectionSort(T arr[], int n) {
    for (int i = 0; i < n; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[minIndex] > arr[j]) {
                minIndex = j;
            }
        }
        swap(arr[minIndex], arr[i]);
    }
}

template<typename T>
void insertionSort(T arr[], int n) {
    for (int i = 0; i < n; i++) {
        // 方法1
//        for (int j = i; j > 0; j--) {
//            if (arr[j] < arr[j - 1])
//                swap(arr[j], arr[j - 1]);
//            else
//                break;
//        }

        // 方法2
        // 直接将原来的退出条件作为循环内部的退出条件
        for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
            swap(arr[j], arr[j - 1]);
        }

    }
}

template<typename T>
void insertionSortAdvanced(T arr[], int n) {
    for (int i = 0; i < n; i++) {
        // 1.保存一开始的arr[i]
        T e = arr[i];
        // 2.j为要插入的点
        int j;
        for (j = i; j > 0 && arr[j - 1] > e; j--) {
            arr[j] = arr[j - 1];
        }
        // 3.将需要插入的点进行插入
        arr[j] = e;
    }
}


int main() {
    using namespace SortTestHelper;
    int n = 100000;

    int *arr1 = SortTestHelper::generateRandomArray(n, 0, n);
    int *arr2 = SortTestHelper::copyIntArray(arr1, n);
    int *arr3 = SortTestHelper::copyIntArray(arr1, n);

    SortTestHelper::testSort("selection sort", selectionSort, arr1, n);
    SortTestHelper::testSort("insertion sort", insertionSort, arr2, n);
    SortTestHelper::testSort("insertion advanced sort", insertionSortAdvanced, arr3, n);
    delete[] arr1;
    delete[] arr2;
    delete[] arr3;

    int *arr4 = SortTestHelper::generateNearlyOrderedArray(n, 0);
    int *arr5 = SortTestHelper::copyIntArray(arr4, n);
    int *arr6 = SortTestHelper::copyIntArray(arr4, n);

    SortTestHelper::testSort("selection sort", selectionSort, arr4, n);
    SortTestHelper::testSort("insertion sort", insertionSort, arr5, n);
    SortTestHelper::testSort("insertion advanced sort", insertionSortAdvanced, arr6, n);

    delete[] arr4;
    delete[] arr5;
    delete[] arr6;

    return 0;
}






