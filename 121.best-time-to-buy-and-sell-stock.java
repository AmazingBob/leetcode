/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
  public int maxProfit(int[] prices) {
    // Corner case
    if (prices == null || prices.length == 0) return 0;
    int res = 0, min = prices[0];
    int dp = 0; // dp memory
    for (int i = 0; i < prices.length; i++) {
      dp = Math.max(prices[i] - min, 0);
      if (prices[i] < min) min = prices[i];
      if (dp > res) res = dp;
    }
    return res;
  }
}
// @lc code=end
