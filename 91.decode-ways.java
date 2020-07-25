/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
  public int numDecodings(String s) {
    // Corner case
    if (s == null || s.length() <= 0) return 0;
    if (s.charAt(0) == '0') return 0;
    // DP
    int curWays = 1;
    int preWays = 1;

    for (int i = 1; i < s.length(); i++) {
      int temp = curWays;
      if (s.charAt(i) == '0') {
        curWays = preWays;
        if (s.charAt(i - 1) >= '3' || s.charAt(i - 1) <= '0') return 0;
      } else if (s.charAt(i - 1) != '0' && Integer.valueOf(s.substring(i - 1, i + 1)) <= 26) {
          curWays += preWays;
      }
      preWays = temp;
    }

    return curWays;
  }
}
// @lc code=end

// class Test{
//   public static void main(String[] args) {
//     String s = "27";
//     Solution sltn = new Solution();
//     int res = sltn.numDecodings(s);
//     return;
//   }
// }