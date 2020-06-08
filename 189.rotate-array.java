/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int count = 0;
    for (int start = 0; count < nums.length; start++) {
      int current = start;
      int prev = nums[start];
      do {
        int next = (current + k) % nums.length;
        int temp = nums[next];
        nums[next] = prev;
        prev = temp;
        current = next;
        count++;
      } while (start != current);
    }
  }
}
// @lc code=end

// class Test {
//   public static void main(String[] args) {
//     int[] nums = {1, 2, 3, 4, 5, 6, 7};
//     int k = 3;
//     Solution s = new Solution();
//     s.rotate(nums, k);
//     return;
//   }
// }
