### Test for random array, size = 100000 , random range [0, 100000]
- SelectionSortUsingCompare : 13071ms
- InsertionSort : 18131ms
- OptimisedInsertionSort : 5ms
-------------
### Test for more ordered random array, size = 100000 , random range [0,3]
- SelectionSortUsingCompare : 9923ms
- InsertionSort : 10612ms
- OptimisedInsertionSort : 3ms

### Test for nearly ordered random array, size = 100000 , random range [0, 100000], swap time = 5
- SelectionSortUsingCompare : 7486ms
- InsertionSort : 1ms
- OptimisedInsertionSort : 3ms

### 结论
1. 选择排序速度最慢
2. 插入排序在近乎有序的情况下，速度是很快的
3. 优化后的插入排序在近乎有序和数字变化不多的情况下，速度也是很快的
