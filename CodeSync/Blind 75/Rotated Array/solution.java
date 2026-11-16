/*
 * Platform: InterviewBit
 * Problem: Rotated Array
 * URL: https://www.interviewbit.com/problems/rotated-array/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Binary Search, Emergent? Register Now ->, Description, Discussion, Submissions, Hints, First Index 20 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-16T17:03:24.627Z
 */

public class Solution {
    // DO NOT MODIFY THE LIST
    public int findMin(final List<Integer> a) {
        int low = 0, high = a.size() - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            // Entire range is sorted
            if (a.get(low) <= a.get(high)) {
                ans = Math.min(ans, a.get(low));
                break;
            }

            int mid = low + (high - low) / 2;

            // Left half is sorted
            if (a.get(low) <= a.get(mid)) {
                ans = Math.min(ans, a.get(low));
                low = mid + 1;
            }
            // Right half is sorted
            else {
                ans = Math.min(ans, a.get(mid));
                high = mid - 1;
            }
        }

        return ans;
    }
}
