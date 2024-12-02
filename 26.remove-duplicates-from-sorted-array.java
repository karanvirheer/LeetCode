/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

    // integer array nums sorted in ascending order 
    // remove the duplicates in-place such that each unique element appears only once
    // relative order of the elements should be kept the same
    // return the number of unique elements in nums
    
    // first number is unique
    // number of unique elements in nums
    int i = 1;
    for (int j=1; j<nums.length;j++){
        if (nums[j] != nums[i-1]){
            nums[i] = nums[j];
            i += 1;
       }
    }
    return i;
        
    }
}
// @lc code=end

