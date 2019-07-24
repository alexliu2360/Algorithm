//
// Created by alexliu on 18-8-4.
//

#ifndef PLAYALGORITHM_N2SORT_H
#define PLAYALGORITHM_N2SORT_H

//
// Created by alexliu on 18-8-4.
//
#include <iostream>
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

//对arr[l...r]范围的数组排序
template<typename T>
void insertionSortAdvanced2(T arr[], int l, int r) {
    for (int i = l+1; i <= r; i++) {
        // 1.保存一开始的arr[i]
        T e = arr[i];
        // 2.j为要插入的点
        int j;
        for (j = i; j > l && arr[j - 1] > e; j--) {
            arr[j] = arr[j - 1];
        }
        // 3.将需要插入的点进行插入
        arr[j] = e;
    }
}

#endif //PLAYALGORITHM_N2SORT_H
