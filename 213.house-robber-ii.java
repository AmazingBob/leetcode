/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */

// @lc code=start
class Solution {
  public int rob(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return 0;
    int n = nums.length;
    if (n == 1) return nums[0];
    
    int[] rob_rf = new int[n];
    int[] nrob_rf = new int[n];
    int[] rob_nrf = new int[n];
    int[] nrob_nrf = new int[n];
    rob_rf[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      rob_rf[i] = nrob_rf[i - 1] + nums[i];
      nrob_rf[i] = Math.max(nrob_rf[i - 1], rob_rf[i - 1]);
      rob_nrf[i] = nrob_nrf[i - 1] + nums[i];
      nrob_nrf[i] = Math.max(nrob_nrf[i - 1 ], rob_nrf[i - 1]);
    }
    
    return Math.max(nrob_rf[n - 1], rob_nrf[n - 1]);
  }
}
// @lc code=end
