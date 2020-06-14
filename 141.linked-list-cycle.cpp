/*
 * @lc app=leetcode id=141 lang=cpp
 *
 * [141] Linked List Cycle
 */

// @lc code=start

// #include <iostream>
// using namespace std;
// struct ListNode {
//   int val;
//   ListNode *next;
//   ListNode(int x) : val(x), next(NULL) {}
// };

class Solution {
 public:
  bool hasCycle(ListNode *head) {
    // Corner case
    if (head == nullptr || head->next == nullptr) return false;
    // Slow and fast pointer
    ListNode *slow = head;
    ListNode *fast = head->next;
    while (slow != fast) {
      if (fast == nullptr || fast->next == nullptr) return false;
      slow = slow->next;
      fast = fast->next->next;
    }
    return true;
  }
};
// @lc code=end
