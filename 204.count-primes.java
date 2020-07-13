


/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
  public int countPrimes(int n) {
    // Corner case
    if (n < 3) return 0;
    // HashSet
    boolean[] isPrimeNumber = new boolean[n];
    int res = n / 2;
    for (int i = 3; i * i < n; i += 2) {
      if (isPrimeNumber[i]) continue;
      for (int j = i * i; j < n; j += 2 * i) {
        if (!isPrimeNumber[j]) {
          --res;
          isPrimeNumber[j] = true;
        }
      }
    }
    return res;
  }
}
// @lc code=end
