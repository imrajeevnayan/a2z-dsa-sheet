/*
 * Platform: InterviewBit
 * Problem: Search in Bitonic Array!
 * URL: https://www.interviewbit.com/problems/search-in-bitonic-array/
 * Language: Go
 * Difficulty: Easy
 * Topics: Programming, Binary Search, Description, Discussion, Submissions, Hints, Median of Array 87 Minutes Medium Asked in:, 67.7%
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-03T10:17:00.601Z
 */

int ans = 0; // Stores count of elements <= B
        int high = A.length - 1;
        int low = 0;
public class Solution {
    public int solve(int[] A, int B) {
        
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
