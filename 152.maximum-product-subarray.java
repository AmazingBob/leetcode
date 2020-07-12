/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
  public int maxProduct(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return 0;
    // DP
    int max = nums[0], min = nums[0], res = nums[0];
    for (int i = 1; i < nums.length; ++i) {
      int temp = max;
      max = Math.max(Math.max(nums[i] * min, nums[i] * max), nums[i]);
      min = Math.min(Math.min(nums[i] * min, nums[i] * temp), nums[i]);
      res = Math.max(res, max);
    }
    return res;
  }
}
// @lc code=end
