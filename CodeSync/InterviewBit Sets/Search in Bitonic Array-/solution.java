/*
 * Platform: InterviewBit
 * Problem: Search in Bitonic Array!
 * URL: https://www.interviewbit.com/problems/search-in-bitonic-array/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Binary Search, Description, Discussion, Submissions, Hints, Capacity To Ship Packages Within B Days Medium, Solutions Thread in Discussions
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-03T10:09:47.025Z
 */

r = peak;

        l = 0;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (A[mid] == B) {
                ans = mid;
                break;
            } 
            else if (A[mid] < B) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

        // If found on left side
        if (ans != -1) {
            return ans;
        }

        // Search in decreasing part
        l = peak + 1;
