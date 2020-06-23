import java.util.Arrays;

/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
  public int findContentChildren(int[] g, int[] s) {
    // Corner case
    if (g == null || g.length == 0) return 0;
    // Sorting
    Arrays.sort(g);
    Arrays.sort(s);
    // Greedy search
    int ptrG = 0, ptrS = 0;
    while (ptrG < g.length && ptrS < s.length) {
      if (g[ptrG] <= s[ptrS]) ptrG++;
      ptrS++;
    }
    return ptrG;
  }
}
// @lc code=end
