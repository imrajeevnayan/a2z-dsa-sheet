# Platform: LeetCode
# Problem: 1
# URL: https://leetcode.com/discuss/post/1122776/summary-of-sliding-window-patterns-for-s-2cnq/
# Language: Python
# Difficulty: Unknown
# Topics: Uncategorized
# Runtime: N/A
# Memory: N/A
# Synced: 2026-09-13T20:31:19.412Z

for(right = 0; right < n; right++):
    update window with element at right pointer
    while (condition not valid):
        remove element at left pointer from window, move left pointer to the right
    update global max
