/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
  public int lengthOfLastWord(String s) {
    int ptr = s.length() - 1, res = 0;
    while (ptr >= 0 && s.charAt(ptr) == ' ') {
      --ptr;
    }
    while (ptr >= 0 && s.charAt(ptr) != ' ') {
      ++res;
      --ptr;
    }
    return res;
  }
}
// @lc code=end
