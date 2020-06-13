/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
  public boolean isPalindrome(String s) {
    // Corner case
    if (s.isEmpty()) return true;
    // Double pointer
    int start = 0, end = s.length() - 1;
    while (start < end) {
      // Ignore non-alphanumeric characters
      while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
        ++start;
      }
      while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
        --end;
      }
      if (start < end
          && Character.toUpperCase(s.charAt(start)) != Character.toUpperCase(s.charAt(end))) {
        return false;
      }
      ++start;
      --end;
    }
    return true;
  }
}
// @lc code=end
