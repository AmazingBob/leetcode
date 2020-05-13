/*
 * @lc app=leetcode id=102 lang=cpp
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
#include <queue>
#include <vector>
using namespace std;
class Solution {
 public:
  vector<vector<int>> levelOrder(TreeNode* root) {
    vector<vector<int>> result;
    if (root == NULL) return result;
    queue<TreeNode*> que;
    que.push(root);
    while (!que.empty()) {
      vector<int> currentLevel;
      int size = que.size();
      for (size_t i = 0; i < size; i++) {
        TreeNode* head = que.front();
        que.pop();
        if (head->left) que.push(head->left);
        if (head->right) que.push(head->right);
        currentLevel.push_back(head->val);
      }
      result.push_back(currentLevel);
    }
    return result;
  }
};
// @lc code=end
