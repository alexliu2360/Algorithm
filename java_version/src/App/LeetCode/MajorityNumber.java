package App.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;


public class MajorityNumber {
    public void test() {

        Integer[] nums1 = {1,1,1,1,2,2,3,3,3,3,3,3};
        Integer[] nums2 = {2,1,2,1,2};
        ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(nums2));
        Solution s = new Solution();
        System.out.println(s.majorityNumber(l));
    }

    public class Solution {
        /*
         * @param nums: a list of integers
         * @return: find a  majority number
         */

        public int majorityNumber(ArrayList<Integer> nums) {

            // 前提：一定存在众数
            // 要求：时间复杂度O(n),空间复杂度O(1)
            int count = 1;
            int cur = nums.get(0);
            for(int i = 1;i<nums.size();i++){
                if(nums.get(i).equals(cur)){
                    count++;
                } else {
                    count--;
                    if(count == 0){
                        cur = nums.get(i);
                        count = 1;
                    }
                }
            }
            return cur;

//            int count = 0;
//            int cur = nums.get(0);
//            for (int i = 0; i < nums.size(); i++) {
//                if (count == 0) {
//                    cur = nums.get(i);
//                    count = 1;
//                } else {
//                    if (cur == nums.get(i)) {
//                        count++;
//                    } else {
//                        count--;
//                    }
//                }
//            }
//            return cur;
        }
    }

}
