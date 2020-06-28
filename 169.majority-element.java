import java.util.*;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
  public int majorityElement(int[] nums) {
    return sortSolution(nums);
  }
  public int sortSolution(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return 0;

    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

  public int hashMapSolution(int[] nums) {
    // Corner case
    if (nums == null || nums.length == 0) return 0;
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
    Map.Entry<Integer, Integer> majorityEntry = null;
    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
      if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
        majorityEntry = entry;
      }
    }
    return majorityEntry.getKey();
  }
}
// @lc code=end
