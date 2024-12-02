/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
       // no numbers are guaranteed unique
       // count of unique elements in nums
       int i = 0;

       for (int j=0; j<nums.length; j++){
            if (nums[j] != val){
                nums[i] = nums[j];
                i += 1;
            }
       }
       return i;
    }
}
// @lc code=end

