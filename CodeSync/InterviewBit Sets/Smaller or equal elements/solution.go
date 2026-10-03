/*
 * Platform: InterviewBit
 * Problem: Smaller or equal elements
 * URL: https://www.interviewbit.com/problems/smaller-or-equal-elements/
 * Language: Go
 * Difficulty: Easy
 * Topics: Programming, Binary Search, Description, Discussion, Submissions, Hints, Median of Array 87 Minutes Medium Asked in:, 60.8%
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-03T10:20:12.874Z
 */

public class Solution {
    public int solve(int[] A, int B) {
        int low = 0;
        int high = A.length - 1;
        int ans = 0; // Stores count of elements <= B
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (A[mid] <= B) {
                // Current mid is valid (<= B)
                // Total elements from index 0 to mid = mid + 1
                ans = mid + 1; 
                // Search right side for more elements <= B
                low = mid + 1; 
            } else {
                // A[mid] > B, so go left
                high = mid - 1;
            }
        }
        
        return ans;
    }
}
