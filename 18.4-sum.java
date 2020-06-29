import java.util.*;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) continue;
      for (int l = i + 1; l < nums.length - 2; l++) {
        if (l - 1 != i && nums[l] == nums[l - 1]) continue;
        int j = l + 1;
        int k = nums.length - 1;
        while (j < k) {
          if (nums[i] + nums[l] + nums[j] + nums[k] == target) {
            res.add(Arrays.asList(nums[i], nums[l], nums[j], nums[k]));
            j++;
            k--;
            while (j < k && nums[j - 1] == nums[j]) j++;
            while (j < k && nums[k + 1] == nums[k]) k--;
          } else if (nums[i] + nums[l] + nums[j] + nums[k] < target) {
            j++;
          } else if (nums[i] + nums[l] + nums[j] + nums[k] > target) {
            k--;
          }
        }
      }
    }

    return res;
  }
}
// @lc code=end
