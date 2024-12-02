/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int len = nums.length;

        for (int j = 0; j < nums.length; j++) {
            ans[j] = nums[j];
            ans[j + len] = nums[j];
        }

        return ans;
    }
}

// @lc code=end
