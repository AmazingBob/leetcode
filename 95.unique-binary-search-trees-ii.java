import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
 */

// @lc code=start
class Solution {
  public List<TreeNode> generateTrees(int n) {
    return generateTreesHelper(1, n);
  }

  private List<TreeNode> generateTreesHelper(int min, int max) {
    List<TreeNode> result = new ArrayList<>();
    if (min > max) return result;
    for (int root = min; root <= max; root++) {
      List<TreeNode> leftList = generateTreesHelper(min, root - 1);
      List<TreeNode> rightList = generateTreesHelper(root + 1, max);
      if (leftList.size() == 0 && rightList.size() == 0) {
        TreeNode bst = new TreeNode(root);
        result.add(bst);
      } else if (leftList.size() == 0) {
        for (TreeNode right : rightList) {
          TreeNode bst = new TreeNode(root);
          bst.right = right;
          result.add(bst);
        }
      } else if (rightList.size() == 0) {
        for (TreeNode left : leftList) {
          TreeNode bst = new TreeNode(root);
          bst.left = left;
          result.add(bst);
        }
      } else {
        for (TreeNode left : leftList) {
          for (TreeNode right : rightList) {
            TreeNode bst = new TreeNode(root);
            bst.left = left;
            bst.right = right;
            result.add(bst);
          }
        }
      }
    }
    return result;
  }
}
// @lc code=end
