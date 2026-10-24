class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        
        // 1. Sort intervals by their end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        
        int count = 0; // Number of intervals to remove
        int lastEnd = intervals[0][1]; // End time of the first interval
        
        // 2. Iterate from the second interval
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            // If current start is less than lastEnd, it overlaps
            if (start < lastEnd) {
                count++; // Remove this interval
            } else {
                // No overlap, update lastEnd to current interval's end
                lastEnd = end;
            }
        }
        
        return count;
    }
}