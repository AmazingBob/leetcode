/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
  public int minSubArrayLen(int s, int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return 0;

    // Sliding window
    int res = Integer.MAX_VALUE;
    int left = 0;
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      while (left <= i && sum >= s) {
        res = Math.min(res, i - left + 1);
        sum -= nums[left++];
      }
    }

    return res == Integer.MAX_VALUE ? 0 : res;
  }
}
// @lc code=end
