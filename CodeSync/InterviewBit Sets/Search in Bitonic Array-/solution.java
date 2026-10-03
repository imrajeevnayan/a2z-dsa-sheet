/*
 * Platform: InterviewBit
 * Problem: Search in Bitonic Array!
 * URL: https://www.interviewbit.com/problems/search-in-bitonic-array/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Binary Search, Description, Discussion, Submissions, Hints, Capacity To Ship Packages Within B Days Medium, Solutions Thread in Discussions
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-03T10:09:38.797Z
 */

r = peak;

        l = 0;
        // Search in increasing part
        int ans = -1;

        int peak = l;
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
            else r = mid;
        }
            if (A[mid] < A[mid + 1]) l = mid + 1;
            int mid = l + (r - l) / 2;
        while (l < r) {
        int l = 0, r = n - 1;
