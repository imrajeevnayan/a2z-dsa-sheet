/*
 * Platform: InterviewBit
 * Problem: Find a peak element
 * URL: https://www.interviewbit.com/problems/find-a-peak-element/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Binary Search, Description, Discussion, Submissions, Hints, First Index 20 Minutes Very Easy Asked in:, Request X Chocolates 38 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-23T18:23:21.970Z
 */

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean leftOk = (mid == 0) || (A.get(mid) >= A.get(mid - 1));
            boolean rightOk = (mid == n - 1) || (A.get(mid) >= A.get(mid + 1));

            if (leftOk && rightOk) {
                ans = A.get(mid);
                break;
            } else if (mid < n - 1 && A.get(mid) < A.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
