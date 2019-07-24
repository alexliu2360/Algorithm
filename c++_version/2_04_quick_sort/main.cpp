//
// Created by alexliu on 18-7-30.
//
#include <iostream>
#include "SortTestHelper.h"
#include "n2sort.h"
#include "MergeSort.h"

using namespace std;


int main() {
    int n = 100000;
    //整形数组
    int *arr1 = SortTestHelper::generateNearlyOrderedArray(n, 5);
    int *arr2 = SortTestHelper::copyIntArray(arr1, n);
    int *arr3 = SortTestHelper::copyIntArray(arr1, n);
    SortTestHelper::testSort("merge sort", mergeSort, arr1, n);
    SortTestHelper::testSort("insertion sort", insertionSort, arr2, n);
    SortTestHelper::testSort("advanced merge sort", advancedMergeSort, arr3, n);

//    merge sort  n =100000: 0.015979s
//    insertion sort  n =100000: 0.006319s
//    advanced merge sort  n =100000: 0.00341s

    delete[] arr1;
    delete[] arr2;
    delete[] arr3;

    return 0;
}