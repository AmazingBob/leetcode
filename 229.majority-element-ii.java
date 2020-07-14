import java.util.*;

/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start
class Solution {
  public List<Integer> majorityElement(int[] nums) {
    List<Integer> res = new ArrayList<>();
    // Corner case
    if (nums == null || nums.length == 0) return res;
    hashMapSolution(nums, res);
    return res;
  }

  private void hashMapSolution(int[] nums, List<Integer> res) {
    // Record freq of elements
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (!freqMap.containsKey(nums[i])) {
        freqMap.put(nums[i], 1);
      } else {
        freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
      }
    }
    // Find majority element
    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
      if (entry.getValue() > nums.length / 3) {
        res.add(entry.getKey());
      }
    }
    return;
  }
}
// @lc code=end
