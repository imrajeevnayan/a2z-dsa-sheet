class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        // Frequency array of size n+1
        int[] freq = new int[n + 1];
        
        // Fill frequency array
        for (int num : nums) {
            if (num >= n) {
                freq[n]++;
            } else {
                freq[num]++;
            }
        }
        
        // Traverse from right to left to find x
        int count = 0;
        for (int i = n; i >= 0; i--) {
            count += freq[i];
            if (count == i) {
                return i;
            }
        }
        
        return -1;
    }
}