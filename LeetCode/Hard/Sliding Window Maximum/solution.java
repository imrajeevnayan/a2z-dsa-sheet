class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        int idx = 0;

        for (int i = 0; i < n; i++) {

            // Window ke bahar wale index hata do
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Current element se chhote elements hata do
            while (!dq.isEmpty() &&   nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            // Current index add karo
            dq.offerLast(i);

            // Window complete hone ke baad answer store karo
            if (i >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}