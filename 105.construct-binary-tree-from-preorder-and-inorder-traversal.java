/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 */

// @lc code=start
class Solution {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    // Corner case
    if (preorder == null
        || inorder == null
        || preorder.length == 0
        || inorder.length == 0
        || preorder.length != inorder.length) return null;
    // call recursive help func
    TreeNode root = buildTreeHelper(preorder, inorder, 0, 0, inorder.length - 1);
    return root;
  }

  private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int preRootID, int inStart, int inEnd) {
    // Exit
    if (preRootID >= preorder.length || inStart > inEnd) return null;
    // 
    TreeNode currRoot = new TreeNode(preorder[preRootID]);
    int inRootID = inStart;
    while (inRootID <= inEnd) {
      if (inorder[inRootID] == preorder[preRootID]) break;
      ++inRootID;
    }
    currRoot.left = buildTreeHelper(preorder, inorder, preRootID + 1, inStart, inRootID - 1);
    currRoot.right = buildTreeHelper(preorder, inorder, preRootID + (inRootID - inStart + 1), inRootID + 1, inEnd);
    return currRoot;
  }
}
// @lc code=end
