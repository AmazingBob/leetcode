/*
 * @lc app=leetcode id=42 lang=cpp
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
#include <iostream>
#include <vector>

static auto height = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();
static auto ans = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

using namespace std;
class Solution {
 public:
  int trap(vector<int>& height) {
    if (height.empty()) return 0;
    int left = 0, right = height.size() - 1;
    int ans = 0;
    int l_max = height[0];
    int r_max = height[height.size() - 1];

    while (left <= right) {
      l_max = max(l_max, height[left]);
      r_max = max(r_max, height[right]);
      if (l_max < r_max) {
        ans += l_max - height[left];
        left++;
      } else {
        ans += r_max - height[right];
        right--;
      }
    }
    return ans;
  }
};
// @lc code=end
