/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
  public int titleToNumber(String s) {
    int strLen = s.length();
    int res = 0;
    for (int i = 0; i < strLen; i++) {
      int digit = (int) (s.charAt(i) - 'A' + 1);
      res = res * 26 + digit;
    }
    return res;
  }
}
// @lc code=end
