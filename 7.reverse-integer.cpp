/*
 * @lc app=leetcode id=7 lang=cpp
 *
 * [7] Reverse Integer
 */

// @lc code=start
#include <iostream>

static auto x = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

static long result = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

class Solution {
 public:
  int reverse(int x) {
    result = 0;
    while (x) {
      result = result * 10 + x % 10;
      x /= 10;
      if (result>INT_MAX||result<INT_MIN) return 0;
    }
    return (int)result;
  }
};
// @lc code=end
