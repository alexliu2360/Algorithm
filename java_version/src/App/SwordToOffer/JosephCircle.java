package App.SwordToOffer;

/**
 * 题目：0, 1, … , n-1 这n个数字排成一个圈圈，从数字0开始每次从圆圏里删除第m个数字。求出这个圈圈里剩下的最后一个数字。
 * tag: List Queue
 *
 * Example:
 *
 * Input: [0,1,2,3,4,5,6]  3
 * Output: 3
 *
 * https://blog.csdn.net/tingyun_say/article/details/52343897
 */


public class JosephCircle {
    public static class Solution {
        public int lastRemaining(int n, int m) {
            if (n < 1 || m < 1) {
                return -1;
            }
            int last = 0;
            for (int i = 2; i <= n; i++) {
                last = (last + m) % i;
            }
            return last;

        }
    }

    private static void test(int n, int m) {
        Solution s = new Solution();
        int rtn = s.lastRemaining(n, m);
        System.out.println(rtn);
    }

    public static void main(String args[]) {
        test(7, 3);
    }

}
