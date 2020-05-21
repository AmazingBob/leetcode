/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) return 0;
    int result = 0;
    int[] map = new int[256];
    int start = 0;
    for (int i = 0; i < s.length(); ++i) {
      ++map[s.charAt(i)];
      while (map[s.charAt(i)] > 1) {
        --map[s.charAt(start)];
        ++start;
      }
      result = Math.max(result, i - start + 1);
    }
    return result;
  }
}
// @lc code=end
