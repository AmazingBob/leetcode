/*
 * @lc app=leetcode id=215 lang=cpp
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
#include <vector>
using namespace std;
class Solution {
 private:
  int quickSelect(vector<int>& nums, int k, int begin, int end) {
    while (begin < end) {
      int mid = (begin + end) / 2;
      int pivot = nums[mid], left = begin, right = end;
      while (true) {
        while (nums[left] < pivot) ++left;
        while (nums[right] > pivot) --right;
        if (left == right) break;
        nums[left] ^= nums[right];
        nums[right] ^= nums[left];
        nums[left] ^= nums[right];
        if (nums[left] == pivot && nums[right] == pivot) ++left;
      }
      if (k < right)
        end = right - 1;
      else if (k > right)
        begin = right + 1;
      else
        return nums[right];
    }
    return nums[end];
  }

 public:
  Solution(){
    ios::sync_with_stdio(false);
    std::cin.tie(nullptr);
    std::cout.tie(nullptr);
  }
  int findKthLargest(vector<int>& nums, int k) { return quickSelect(nums, nums.size() - k, 0, nums.size() - 1); }
};
// @lc code=end
