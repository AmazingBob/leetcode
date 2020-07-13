import java.util.HashSet;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
  public boolean isHappy(int n) {
    // Corner case
    if (n < 1) return false;
    // HashSet
    HashSet<Integer> set = new HashSet<>();
    while (n != 1) {
      int temp = 0;
      while (n != 0) {
        int digit = n % 10;
        temp += digit * digit;
        n /= 10;
      }
      if (!set.add(temp)) {
        return false;
      }
      n = temp;
    }
    return true;
  }
}
// @lc code=end
