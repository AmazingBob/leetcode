/*
 * @lc app=leetcode id=106 lang=java
 *
 * [106] Construct Binary Tree from Inorder and Postorder Traversal
 */

// @lc code=start
class Solution {
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    // Corner case
    if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0 || inorder.length != postorder.length) return null;
    TreeNode root = buildTreeHelper(inorder, postorder, postorder.length - 1, 0, inorder.length - 1);
    return root;
  }

  private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int postRootID, int inStart, int inEnd) {
    // Exit
    if (postRootID < 0 || inStart > inEnd) return null;
    TreeNode currRoot = new TreeNode(postorder[postRootID]);
    int inRootID = inStart;
    while (inRootID <= inEnd) {
      if (inorder[inRootID] == postorder[postRootID]) break;
      ++inRootID;
    }
    currRoot.left = buildTreeHelper(inorder, postorder, postRootID - (inEnd - inRootID + 1), inStart, inRootID - 1);
    currRoot.right = buildTreeHelper(inorder, postorder, postRootID - 1, inRootID + 1, inEnd);
    return currRoot;
  }
}
// @lc code=end

// class Test {
//   public static void main(String[] args) {
//     int[] inorder = {9,3,15,20,7};
//     int[] postorder = {9,15,7,20,3};
//     Solution sltn = new Solution();
//     TreeNode root = sltn.buildTree(inorder, postorder);
//     return;
//   }
// }