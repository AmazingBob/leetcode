/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
  public String reverseWords(String s) {
    int j = s.length();
    StringBuilder sb = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        j = i;
      } else if (i == 0 || s.charAt(i - 1) == ' ') {
        if (sb.length() == 0) {
          sb.append(s.substring(i, j));
        } else {
          sb.append(' ' + s.substring(i, j));
        }
      }
    }
    return sb.toString();
  }
}

// @lc code=end
