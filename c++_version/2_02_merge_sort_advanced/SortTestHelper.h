//
// Created by alexliu on 18-8-4.
//

#ifndef PLAYALGORITHM_SORTTESTHELPER_H
#define PLAYALGORITHM_SORTTESTHELPER_H

#include <iostream>
#include <ctime>
#include <cassert>
#include <random>

using namespace std;

namespace SortTestHelper {
    int *generateRandomArray(int n, int rangeL, int rangeR) {
        assert(rangeL <= rangeR);
        int *arr = new int[n];

        // 根据当前时间值，设定一个随机种子，保证每次产生的变化都是不一样的
        srand((unsigned) time(NULL));

        for (int i = 0; i < n; i++) {
            int r = rand();
            // 取模为了保证在[rangL, rangR]的范围内
            arr[i] = r % (rangeR - rangeL + 1) + rangeL;
        }

        return arr;
    }

    int *generateNearlyOrderedArray(int n, int swapTimes) {
        int *arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = i;

        // 根据当前时间值，设定一个随机种子，保证每次产生的变化都是不一样的
        srand((unsigned) time(NULL));

        for (int i = 0; i < swapTimes; i++) {
            // 这里取模是为了保证posx和posy的取值是在0～n的范围内
            int posx = rand() % n;
            int posy = rand() % n;
            swap(arr[posx], arr[posy]);
        }
        return arr;
    }

    char *memcpy(char *dst, const char *src, int n) {
        if (src == NULL || dst == NULL)
            return NULL;

        //　保证返回值是从头开始的
        char *tmp = dst;
        for (int i = 0; i < n; i++) {
            *tmp++ = *src++;
        }
        return dst;
    }

    int *copyIntArray(int a[], int n) {
        int *arr = new int[n];
//        char *rtn = memcpy((char *) arr, (const char *) a, n * sizeof(int));
//        if (rtn) {
//            return (int *) rtn;
//        } else {
//            return NULL;
//        }

        copy(a, a+n, arr);
        return arr;
    }

    template<typename T>
    bool isSorted(T a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    template<typename T>
    void print(T a[], int n) {
        for (int i = 0; i < n; ++i) {
            cout << a[i] << " ";
        }
        cout << endl;
    };

    template<typename T>
    void testSort(const char *sortName, void(*sort)(T[], int), T arr[], int n) {
        clock_t startTime = clock();
        sort(arr, n);
        clock_t endTime = clock();

        assert(isSorted(arr, n));
        cout << sortName << "  n =" << n <<": " << double(endTime - startTime) / CLOCKS_PER_SEC << "s" << endl;
    }
}

#endif //PLAYALGORITHM_SORTTESTHELPER_H
