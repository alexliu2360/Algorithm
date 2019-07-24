//
// Created by alexliu on 18-7-30.
//
#include <iostream>
#include "student.h"
#include "SortTestHelper.h"

using namespace std;

template<typename T>
void selectionSort(T arr[], int n) {
    for (int i = 0; i < n; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        swap(arr[i], arr[minIndex]);
    }
}


int main() {
    int n = 100;
    //整形数组
    for(int i=0;i<3;i++){
        n = 10*n;
        int *arr = SortTestHelper::generateRandomArray(n, 0, n);
        SortTestHelper::sortTest("selection sort", selectionSort, arr, n);
        delete[] arr;
    }

    return 0;
}