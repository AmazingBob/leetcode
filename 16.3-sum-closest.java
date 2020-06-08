import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
  public int threeSumClosest(int[] nums, int target) {
    int res = nums[0] + nums[1] + nums[nums.length - 1];
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; ++i) {
      int start = i + 1, end = nums.length - 1;
      while (start < end) {
        int sum = nums[i] + nums[start] + nums[end];
        if (sum > target) {
          --end;
        } else {
          ++start;
        }
        if (Math.abs(sum - target) < Math.abs(res - target)) {
          res = sum;
        }
      }
    }
    return res;
  }
}
// @lc code=end

// class Test{
//   public static void main(String[] args) {
//     int[] nums = {-1,2,1,-4};
//     int target = 1;
//     Solution sltn = new Solution();
//     int res = sltn.threeSumClosest(nums, target);
//     System.out.println(res);
//     return;
//   }
// }