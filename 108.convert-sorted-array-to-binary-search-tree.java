/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

// @lc code=start
class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    // Corner case
    if (nums.length == 0) return null;
    // DFS recursive method
    TreeNode root = helper(nums, 0, nums.length - 1);
    return root;
  }

  private static TreeNode helper(int[] nums, int low, int high) {
    if (low > high) return null;
    int mid = low + (high - low) / 2; // Prevent overflow
    TreeNode node = new TreeNode(nums[mid]);
    node.left = helper(nums, low, mid - 1);
    node.right = helper(nums, mid + 1, high);
    return node;
  }
}
// @lc code=end
