/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
  public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0)
      return -1;
    int lo = (nums.length - 1) >> 1, hi = lo + 1, pivot_id = 0;
    while (lo >= 0 && hi < nums.length && nums[lo] < nums[hi]) {
      --lo;
      ++hi;
    }
    pivot_id = hi;
    // if (pivot_id == nums.length)
    //   return binarySearch(nums, 0, nums.length - 1, target);
    // if (target < nums[0] && target > nums[nums.length - 1])
    //   return -1;
    // else if (target >= nums[0])
    //   return binarySearch(nums, 0, pivot_id - 1, target);
    // else
    //   return binarySearch(nums, pivot_id, nums.length - 1, target);
  }

  private int binarySearch(int[] nums, int lo, int hi, int target) {
    if (lo > hi)
      return -1;
    while (lo <= hi) {
      int mid = (lo + hi) >> 1;
      if (nums[mid] == target)
        return mid;
      else if (nums[mid] > target)
        hi = mid - 1;
      else
        lo = mid + 1;
    }
    return -1;
  }
}


// @lc code=end
class Test {
  public static void main(String[] args) {
    Solution sltn = new Solution();
    int[] nums = {5, 1, 3};
    int target = 5;
    int res = sltn.search(nums, target);
    return;
  }
}
