import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    int target = 0;
    for (int i = 0; i < nums.length; ++i) {
      if (i > 0 && nums[i] == nums[i - 1]) continue;
      int j = i + 1, k = nums.length - 1;
      while (j < k) {
        if (nums[i] + nums[j] + nums[k] < target) {
          ++j;
          while (j < k && nums[j] == nums[j - 1]) ++j;
        } else if (nums[i] + nums[j] + nums[k] > target) {
          --k;
          while (j < k && nums[k] == nums[k + 1]) --k;
        } else {
          res.add(Arrays.asList(nums[i], nums[j], nums[k]));
          ++j;
          --k;
          while (j < k && nums[j] == nums[j - 1]) ++j;
          while (j < k && nums[k] == nums[k + 1]) --k;
        }
      }
    }
    return res;
  }
}
// @lc code=end

// class Test {
//   public static void main(String[] args) {
//     int[] nums = {-1, 0, 1, 2, -1, -4};
//     Solution sltn = new Solution();
//     List<List<Integer>> res = sltn.threeSum(nums);
//     System.out.print(res);
//     return;
//   }
// }
