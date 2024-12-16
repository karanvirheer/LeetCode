// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // no numbers are guaranteed unique
        // count of unique elements in nums
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i += 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int result = solution.removeElement(nums, val);
        System.out.println("Result: " + result);
        System.out.print("Updated Array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
// @lc code=end
