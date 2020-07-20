#
# @lc app=leetcode id=13 lang=python3
#
# [13] Roman to Integer
#

# @lc code=start
#
# @lc app=leetcode id=13 lang=python3
#
# [13] Roman to Integer
#


class Solution:
    def romanToInt(self, s: str) -> int:
        hash_table = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        total = 0
        s_len = len(s)
        for i in range(s_len-1):
            curr_val = hash_table[s[i]]
            next_val = hash_table[s[i+1]]
            if curr_val < next_val:
                total -= curr_val
            else:
                total += curr_val
        total += hash_table[s[-1]]
        return total

# @lc code=end
