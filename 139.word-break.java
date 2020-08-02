import java.util.HashSet;

/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
  public boolean wordBreak(String s, List<String> wordDict) {
    // Corner case
    if (s == null || wordDict == null) return false;

    HashSet<String> hashWordDict = new HashSet<String>();
    for (String str : wordDict) {
      hashWordDict.add(str);
    }
    boolean[] breakable = new boolean[s.length() + 1];
    breakable[0] = true;

    for (int i = 1; i < s.length() + 1; i++) {
      for (int j = i; j > 0; j--) {
        String sub = s.substring(i - j, i);
        if (hashWordDict.contains(sub)) {
          if (breakable[i - j] == true) {
            breakable[i] = true;
            break;
          }
        }
      }
    }
    return breakable[s.length()];
  }
}
// @lc code=end
