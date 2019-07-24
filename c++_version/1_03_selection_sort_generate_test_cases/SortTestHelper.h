//
// Created by alexliu on 18-7-30.
//

#ifndef PLAYALGORITHM_SORTTESTHELPER_H
#define PLAYALGORITHM_SORTTESTHELPER_H

#include <iostream>
#include <ctime>
#include <cassert>

using namespace std;
namespace SortTestHelper {
    int *generateRandomArray(int n, int rangeL, int rangeR) {
        assert(rangeL <= rangeR);
        int *arr = new int[n];
        // 设置种子
        srand(time(NULL));
        for (int i = 0; i < n; i++) {
            int r = rand();
            arr[i] = r % (rangeR - rangeL + 1) + rangeL;
        }
        return arr;
    }

    template<typename T>
    void print(T arr[], int n) {
        for (int i = 0; i < n; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }

    template<typename T>
    bool isSorted(T a[], int n) {
        for (int i = 0; i < n - 1; ++i) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    template<typename T>
    void sortTest(string sortName, void(*sort)(T[], int), T a[], int n) {
        clock_t startTime = clock();
        sort(a, n);
        clock_t endTime = clock();

        assert(isSorted(a, n));
        cout << " n=" << n << "  " <<sortName << ": " << double(endTime - startTime) / CLOCKS_PER_SEC << endl;
    }
}


#endif //PLAYALGORITHM_SORTTESTHELPER_H
