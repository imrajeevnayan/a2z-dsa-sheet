class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int left = (n - 1) / 2; // end of first half
        int right = n - 1;      // end of second half

        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                nums[i] = sorted[left--];
            } else {
                nums[i] = sorted[right--];
            }
        }
    }
}