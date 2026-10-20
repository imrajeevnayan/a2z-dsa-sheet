class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n = words.length;
        int[] wordFreqs = new int[n];
        
        // Step 1: Calculate f(w) for all words
        for (int i = 0; i < n; i++) {
            wordFreqs[i] = f(words[i]);
        }
        
        // Step 2: Sort word frequencies to use Binary Search
        Arrays.sort(wordFreqs);
        
        int m = queries.length;
        int[] result = new int[m];
        
        // Step 3: For each query, find count of words with f(w) > f(query)
        for (int i = 0; i < m; i++) {
            int qFreq = f(queries[i]);
            
            // Find first index where wordFreqs[index] > qFreq
            // Since array is sorted, we can use binary search
            int idx = upperBound(wordFreqs, qFreq);
            
            result[i] = n - idx;
        }
        
        return result;
    }
    
    // Helper function to calculate f(s)
    private int f(String s) {
        char minChar = 'z';
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c < minChar) {
                minChar = c;
                count = 1;
            } else if (c == minChar) {
                count++;
            }
        }
        return count;
    }
    
    // Binary search to find first element > target
    private int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}