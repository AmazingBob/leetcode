/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
  public void moveZeroes(int[] nums) {
    int lastNonZeroFoundAt = 0;
    /** 
     * Time: O(n) 
     * Space: O(1) 
     */
    // Over write non zero element
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) nums[lastNonZeroFoundAt++] = nums[i]; // Not need to record zero position
    }
    // Fill with zero
    for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
// @lc code=end
