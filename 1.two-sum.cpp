/*
 * @lc app=leetcode id=1 lang=cpp
 *
 * [1] Two Sum
 */

// @lc code=start
#include <iostream>
#include <unordered_map>
#include <vector>

static auto x = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

static auto result = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

class Solution {
 public:
  std::vector<int> twoSum(std::vector<int>& nums, int target) {
    std::vector<int> result;
    std::unordered_map<int, int> hash_table;
    for (int i = 0; i < nums.size(); i++) {
      if (hash_table.find(target - nums[i]) != hash_table.end()) {
        result.push_back(i);
        result.push_back(hash_table.find(target - nums[i])->second);
        break;
      } else {
        hash_table[nums[i]] = i;
      }
    }
    return result;
  }
};
// @lc code=end
