/*
 * @lc app=leetcode id=9 lang=cpp
 *
 * [9] Palindrome Number
 */

// @lc code=start
#include <iostream>
#include <string>
static auto x = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();
class Solution {
 public:
  bool isPalindrome(int x) {
    std::string s1 = std::to_string(x);
    std::string s2(s1.rbegin(), s1.rend());
    return s1 == s2;
  }
};
// @lc code=end
