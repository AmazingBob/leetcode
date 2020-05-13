/*
 * @lc app=leetcode id=21 lang=cpp
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/*
 * @lc app=leetcode id=21 lang=cpp
 *
 * [21] Merge Two Sorted Lists
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
static const auto io_sync_off = []() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);
    return nullptr;
}();
class Solution {
   public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        // if (l1 == NULL) return l2;
        // if (l2 == NULL) return l1;
        // if (l1->val < l2->val) {
        //     l1->next = mergeTwoLists(l1->next, l2);
        //     return l1;
        // } else {
        //     l2->next = mergeTwoLists(l2->next, l1);
        //     return l2;
        // }
        // 
        if (!l1 && !l2) return NULL;
        ListNode* new_list = new ListNode(0);
        ListNode* pre = new_list;
        while (l1 != NULL && l2 != NULL) {
            if (l1->val < l2->val) {
                pre->next = l1;
                l1 = l1->next;
            } else {
                pre->next = l2;
                l2 = l2->next;
            }
            pre = pre->next;
        }
        if (l1) {
            pre->next = l1;
        } else {
            pre->next = l2;
        }
        return new_list->next;
    }
};

// @lc code=end
