/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/*
 * The isBadVersion API is defined in the parent class VersionControl. boolean isBadVersion(int
 * version);
 */

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    long lo = 1, hi = n;
    while (lo < hi) {
      long mid = (lo + hi) >> 1;
      if (isBadVersion((int)mid)) hi = mid;
      else lo = mid + 1;
    }
    return (int) hi;
  }
}
// @lc code=end
