/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
  public String longestPalindrome(String s) {
    if (s.length()==0)
      return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
      int len = Math.max(expandFromMiddle(s, i, i), expandFromMiddle(s, i, i + 1));
      if (len > end - start + 1) {
        start = i - ((len - 1) / 2);
        end = i + (len / 2);
      }
    }
    return s.substring(start, end + 1);
  }

  private int expandFromMiddle(String s, int left, int right) {
    if (s == null || left > right)
      return 0;
    int len = 0;
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      len = right - left + 1;
      left--;
      right++;
    }
    return len;
  }
}
// @lc code=end
