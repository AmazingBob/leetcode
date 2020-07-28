import java.util.Arrays;
import java.util.Collections;

/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// @lc code=start
class Solution {
  public int hIndex(int[] citations) {
    // Corner case
    if (citations == null || citations.length == 0) return 0;

    Arrays.sort(citations);
    int index = citations.length - 1;
    int hIndex = 0;
    while (index >= 0) {
      if (citations[index] >= citations.length - index) ++hIndex;
      --index;
    }

    return hIndex;
  }
}
// @lc code=end
