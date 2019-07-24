//
// Created by alexliu on 18-7-30.
//
#include <iostream>

using namespace std;

void selectionSort(int arr[], int n) {
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

void print(int arr[], int n){
    for(int i = 0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main() {
    int a[10] = {0, 2, 3 , 53, 12, 34, 21, 45,87, 10};
    selectionSort(a, 10);
    print(a, 10);
    return 0;
}