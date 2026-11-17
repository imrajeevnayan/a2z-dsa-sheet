/*
 * Platform: InterviewBit
 * Problem: Count Element Occurence
 * URL: https://www.interviewbit.com/problems/count-element-occurence/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Binary Search, Emergent? Register Now ->, Description, Discussion, Submissions, Hints, First Index 20 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-17T09:46:16.048Z
 */

while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (A.get(mid) == target) {
                ans = mid;
                high = mid - 1; // search left
            } else if (A.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
    
    private int findLast(List<Integer> A, int target) {
        int low = 0, high = A.size() - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (A.get(mid) == target) {
                ans = mid;
                low = mid + 1; // search right
            } else if (A.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
}
