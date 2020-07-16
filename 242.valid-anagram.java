import java.util.*;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
  public boolean isAnagram(String s, String t) {
    // Corner case
    if (s.length() != t.length()) return false;

    int[] freqMap = new int[26];
    for (char c : s.toCharArray()) {
      ++freqMap[c - 'a'];
    }
    for (char c : t.toCharArray()) {
      --freqMap[c - 'a'];
    }
    for (int i : freqMap) {
      if (i != 0) return false;
    }

    return true;
  }
}
// @lc code=end
