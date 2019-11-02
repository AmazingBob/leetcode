/*
 * @lc app=leetcode id=1 lang=cpp
 *
 * [1] Two Sum
 */

// @lc code=start
#include <iostream>
#include <vector>
using namespace std;
static auto x = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

class Solution {
 public:
  vector<int> twoSum(vector<int>& nums, int target) {
    vector<int> indices;
    int lenOfVectors = nums.size();
    bool found = false;
    vector<pair<int, int>> new_nums;
    for (int i = 0; i < lenOfVectors; ++i) {
      new_nums.push_back(make_pair(nums[i], i));
    }
    sort(new_nums.begin(), new_nums.end());
    int j = 0, k = lenOfVectors - 1;
    while (j < k) {
      if (new_nums[j].first + new_nums[k].first == target) {
        indices.push_back(new_nums[j].second);
        indices.push_back(new_nums[k].second);
        break;
      } else if (new_nums[j].first + new_nums[k].first < target) {
        j++;
      } else {
        k--;
      }
    }
    return indices;
  }
};
// @lc code=end
