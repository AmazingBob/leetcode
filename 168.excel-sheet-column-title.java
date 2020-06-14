/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
  public String convertToTitle(int n) {
    // Corner case
    if (n < 1) return null;

    StringBuilder sb = new StringBuilder(); // Faster than operator+
    while (n > 0) {
      int digit = (n - 1) % 26;
      sb.append((char) ('A' + digit));
      n = (n - 1) / 26;
    }
    return sb.reverse().toString();
  }
}
// @lc code=end
