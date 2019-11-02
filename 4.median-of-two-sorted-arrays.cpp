/*
 * @lc app=leetcode id=4 lang=cpp
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
#include <iostream>
#include <vector>
using namespace std;

static auto x = []() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  return NULL;
}();

class Solution {
 public:
  double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
    int nums1_length = nums1.size(), nums2_length = nums2.size();
    if (nums1_length > nums2_length)
      return findMedianSortedArrays(nums2, nums1);
    int length = nums1_length + nums2_length, cut1 = 0, cut2 = 0, cutL = 0,
        cutR = nums1_length;
    while (cut1 <= nums1_length) {
      cut1 = (cutR - cutL) / 2 + cutL;
      cut2 = length / 2 - cut1;
      double L1 = cut1 == 0 ? INT_MIN : nums1[cut1 - 1];
      double L2 = cut2 == 0 ? INT_MIN : nums2[cut2 - 1];
      double R1 = cut1 == nums1_length ? INT_MAX : nums1[cut1];
      double R2 = cut2 == nums2_length ? INT_MAX : nums2[cut2];
      if (L1 > R2) {
        cutR = cut1 - 1;
      } else if (L2 > R1) {
        cutL = cut1 + 1;
      } else {
        if (length % 2 == 0) {
          L1 = L1 > L2 ? L1 : L2;
          R1 = R1 < R2 ? R1 : R2;
          return (L1 + R1) / 2;
        } else {
          R1 = R1 < R2 ? R1 : R2;
          return R1;
        }
      }
    }
    return -1;
  }
};
// @lc code=end
