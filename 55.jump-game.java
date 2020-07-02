/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
  public boolean canJump(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return true;
    // Time: O(n) / Space: O(1);
    int maxPos = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > maxPos) return false;
      maxPos = Math.max(maxPos, i + nums[i]);
      if (maxPos >= nums.length - 1) return true;
    }
    return false;
  }
}
// @lc code=end