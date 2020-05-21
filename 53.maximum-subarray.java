/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
  public int maxSubArray(int[] nums) {
    int max = nums[0], sum = nums[0];
    for (int i = 1; i < nums.length; ++i) {
      sum = Math.max(sum + nums[i], nums[i]);
      if (sum > max) max = sum;
    }
    return max;
  }
}
// @lc code=end
