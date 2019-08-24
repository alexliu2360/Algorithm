### Test for random array, size = 100000 , random range [0, 100000]
- SelectionSortUsingCompare : 12992ms
- SelectionSortOptimized : 11547ms
- InsertionSort : 18108ms
- InsertionSortOptimized : 12665ms
- InsertionShellSort : 85ms
- BubbleSort : 67763ms
- BubbleSortOptimized : 58102ms
- BubbleSortOptimized2 : 52632ms


### Test for more ordered random array, size = 100000 , random range [0,3]
- SelectionSortUsingCompare : 9931ms
- SelectionSortOptimized : 19791ms
- InsertionSort : 10989ms
- InsertionSortOptimized : 8453ms
- InsertionShellSort : 11ms
- BubbleSort : 54281ms
- BubbleSortOptimized : 38246ms
- BubbleSortOptimized2 : 34407ms


### Test for nearly ordered random array, size = 100000 , random range [0, 100000], swap time = 5
- SelectionSortUsingCompare : 7489ms
- SelectionSortOptimized : 5489ms
- InsertionSort : 2ms
- InsertionSortOptimized : 1ms
- InsertionShellSort : 7ms
- BubbleSort : 22975ms
- BubbleSortOptimized : 9856ms
- BubbleSortOptimized2 : 9400ms

### 结论
1. 选择排序速度最慢
2. 插入排序在近乎有序的情况下，速度是很快的
3. 优化后的插入排序在近乎有序和数字变化不多的情况下，速度也是很快的
4. 希尔排序是目前这几种排序算法中效果最好的