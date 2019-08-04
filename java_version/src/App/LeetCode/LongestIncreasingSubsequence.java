package App.LeetCode;/*
* Clarification

最长上升子序列的定义：

最长上升子序列问题是在一个无序的给定序列中找到一个尽可能长的由低到高排列的子序列，这种子序列不一定是连续的或者唯一的。
https://en.wikipedia.org/wiki/Longest_increasing_subsequence
Example

样例 1:
	输入:  [5,4,1,2,3]
	输出:  3

	解释:
	LIS 是 [1,2,3]


样例 2:
	输入: [4,2,4,5,3,7]
	输出:  4

	解释:
	LIS 是 [2,4,5,7]

Challenge

要求时间复杂度为O(n^2) 或者 O(nlogn)

* */


public class LongestIncreasingSubsequence {

    public void test() {
        int[] arr = {5,2,3,4,1};
        Solution s = new Solution();
        s.longestIncreasingSubsequence(arr);
        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public class Solution {
        /**
         * @param nums: An integer array
         * @return: The length of LIS (longest increasing subsequence)
         */
        public int longestIncreasingSubsequence(int[] nums) {
            return 0;
        }
    }
}
