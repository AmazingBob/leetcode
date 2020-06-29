
/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
  public int missingNumber(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return 0;
    /** Time: O(n) Space: O(1) */
    int missing = nums.length;
    for (int i = 0; i < nums.length; i++) {
      missing ^= i ^ nums[i];
    }
    return missing;
  }
}
// @lc code=end
