/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
  public int rob(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return 0;
    if (nums.length == 1) return nums[0];
    /* 
     * Dynamic Programming
     * Time: O(n)
     * Space: O(1);
     */
    int[] dp = new int[2];
    // Initialize
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
      dp[i % 2] = Math.max(dp[(i - 2) % 2] + nums[i], dp[(i - 1) % 2]);
    }
    return dp[(nums.length - 1) % 2];
  }
}
// @lc code=end
