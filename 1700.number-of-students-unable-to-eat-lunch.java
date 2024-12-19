/*
 * @lc app=leetcode id=1700 lang=java
 *
 * [1700] Number of Students Unable to Eat Lunch
 */

// @lc code=start
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] sum = { 0, 0 };
        for (int st : students) {
            sum[st] += 1;
        }
        for (int sand : sandwiches) {
            // check if any student wants it
            if (sum[sand] > 0) {
                sum[sand]--;
            // if not
            } else {
                break;
            }
        }
        return sum[0] + sum[1];
    }
}
// @lc code=end
