/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k + 1);

        for (int num : nums){
            q.add(num);
            if (q.size() > k){
                q.poll();
            }
        }
        return q.poll();
    }
}
// @lc code=end

