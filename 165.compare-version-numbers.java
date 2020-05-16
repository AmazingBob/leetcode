/*
 * @lc app=leetcode id=165 lang=java
 *
 * [165] Compare Version Numbers
 */

// @lc code=start
class Solution {
  public int compareVersion(final String version1, final String version2) {
    String[] ver1 = version1.split("\\.");
    String[] ver2 = version2.split("\\.");
    int max_length = Math.max(ver1.length, ver2.length);
    int val1 = 0, val2 = 0;
    for (int i = 0; i < max_length; i++) {
      if (i < ver1.length)
        val1 = Integer.parseInt(ver1[i]);
      if (i < ver2.length)
        val2 = Integer.parseInt(ver2[i]);
      if (val1 > val2) {
        return 1;
      } else if (val1 < val2) {
        return -1;
      }
      val1 = 0;
      val2 = 0;
    }
    return 0;
  }
}

// @lc code=end
