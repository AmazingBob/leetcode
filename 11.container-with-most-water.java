/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
  public int maxArea(int[] height) {
    int result = 0;
    int l = 0, r = height.length - 1;
    while (l < r) {
      result = Math.max(result, Math.min(height[l], height[r]) * (r - l));
      if (height[l] < height[r]) ++l;
      else --r;
    }
    return result;
  }
}
// @lc code=end
