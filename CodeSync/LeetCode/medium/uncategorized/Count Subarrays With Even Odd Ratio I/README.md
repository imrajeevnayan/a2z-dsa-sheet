# Count Subarrays With Even Odd Ratio I

- Platform: LeetCode
- Language: Weekly Contest 513
- Difficulty: Medium
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/contest/weekly-contest-513/problems/count-subarrays-with-even-odd-ratio-i/
- Synced: 2026-08-07T06:17:06.903Z

## Problem Description

You are given an integer array nums and two integers a and b. For a subarray, let: x be the number of even elements. y be the number of odd elements. The ratio of even to odd elements in a subarray is defined as x / y, where ratios are compared by their exact rational values. A subarray is considered valid if: y > 0, and x / y <= a / b. Return the number of valid subarrays in nums. Example 1: Input: nums = [1,2,1,2], a = 3, b = 2 Output: 7 Explanation: The following are the valid subarrays: Subarray Values Even Count Odd Count Ratio nums[0..0] [1] 0 1 0 / 1 nums[0..1] [1, 2] 1 1 1 / 1 nums[0..2] [1, 2, 1] 1 2 1 / 2 nums[0..3] [1, 2, 1, 2] 2 2 2 / 2 nums[1..2] [2, 1] 1 1 1 / 1 nums[2..2] [1] 0 1 0 / 1 nums[2..3] [1, 2] 1 1 1 / 1 Thus, the number of valid subarrays is 7. Example 2: Input: nums = [2,2,1], a = 2, b = 1 Output: 3 Explanation: The following are the valid subarrays: Subarray Values Even Count Odd Count Ratio nums[0..2] [2, 2, 1] 2 1 2 / 1 nums[1..2] [2, 1] 1 1 1 / 1 nums[2..2] [1] 0 1 0 / 1 Thus, the number of valid subarrays is 3. Example 3: Input: nums = [2,2,2], a = 1, b = 1 Output: 0 Explanation: Every subarray contains 0 odd numbers, so no subarray is valid. Constraints: 1 <= nums.length <= 1000 1 <= nums[i] <= 1000 1 <= a, b <= 1000

## Explanation

This solution was accepted on LeetCode using Weekly Contest 513. Review the synced source file for the implementation details.
