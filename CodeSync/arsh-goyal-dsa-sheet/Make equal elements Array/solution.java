/*
 * Platform: InterviewBit
 * Problem: Make equal elements Array
 * URL: https://www.interviewbit.com/problems/make-equal-elements-array/
 * Language: Java
 * Difficulty: Medium
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Solutions Thread in Discussions, All Hints and Problem solving approach
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-18T03:56:44.047Z
 */

int size = uniqueList.size();
        
        if (size == 1) {
            return 1;
        } else if (size == 2) {
            // Difference must be exactly B
            if (uniqueList.get(1) - uniqueList.get(0) == B) {
                return 1;
            } else {
                return 0;
        
        ArrayList<Integer> uniqueList = new ArrayList<>(uniqueElements);
        Collections.sort(uniqueList);
        // Convert to list and sort
        }
        
            return 0;
        // If there are more than 3 unique elements, it's impossible
        // Because we can only reach 3 distinct levels: T-B, T, T+B
        if (uniqueElements.size() > 3) {
        HashSet<Integer> uniqueElements = new HashSet<>(A);
        
        // Use a HashSet to get unique elements
            }
        } else if (size == 3) {
            // Must form an AP with difference B
            int diff1 = uniqueList.get(1) - uniqueList.get(0);
            int diff2 = uniqueList.get(2) - uniqueList.get(1);
