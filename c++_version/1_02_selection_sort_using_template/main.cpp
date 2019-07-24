//
// Created by alexliu on 18-7-30.
//
#include <iostream>
#include "student.h"

using namespace std;

template <typename T>
void selectionSort(T arr[], int n) {
    for(int i=0;i<n;i++){
        int minIndex = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[minIndex]){
                minIndex = j;
            }
        }
        swap(arr[i], arr[minIndex]);
    }
}

template <typename T>
void print(T arr[], int n){
    for(int i = 0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main() {
    //整形数组
    int a[10] = {0, 2, 3 , 53, 12, 34, 21, 45,87, 10};
    selectionSort(a, 10);
    print(a, 10);

    //浮点数
    float b[4] = {4.4,3.3,2.2,1.1};
    selectionSort(b, 4);
    print(b, 4);

    //字符串数组
    string c[4] = {"D","C","B","A"};
    selectionSort(c,4);
    print(c, 4);

    //Student对象
    Student s[4] = {{"a",98}, {"b",28}, {"c",72},{"d",98}};
    selectionSort(s, 4);
    print(s, 4);

    return 0;
}