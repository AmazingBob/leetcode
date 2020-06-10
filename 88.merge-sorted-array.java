/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if(n == 0) return;
    int insertID = m + n - 1, maxID1 = m - 1, maxID2 = n - 1;
    while(maxID1 >= 0 && maxID2 >= 0){
      if(nums1[maxID1] >= nums2[maxID2]){
        nums1[insertID--] = nums1[maxID1--];
      } else {
        nums1[insertID--] = nums2[maxID2--];
      }
    }
    while(maxID2 >= 0){
      nums1[insertID--] = nums2[maxID2--];
    }
  }
}
// @lc code=end
