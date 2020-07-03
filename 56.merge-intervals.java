import java.util.*;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
  public int[][] merge(int[][] intervals) {
    List<int[]> list = new ArrayList<>();
    // Corner case
    if (intervals == null || intervals.length == 0) return new int[0][0];
    // Sort
    Arrays.sort(intervals, (int[] a, int[] b) -> {
      return a[0] - b[0];
    });
    // For-loop
    int[] prev = intervals[0];
    for (int i = 1; i < intervals.length; i++) {
      int[] cur = intervals[i];
      if (prev[1] >= cur[0]) {
        cur[0] = prev[0];
        cur[1] = Math.max(prev[1], cur[1]);
      } else {
        list.add(prev);
      }
      prev = cur;
    }
    list.add(prev);
    int[][] res = new int[list.size()][2];
    for (int i = 0; i < list.size(); i++) {
      res[i] = list.get(i);
    }
    return res;
  }
}
// @lc code=end
