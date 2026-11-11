class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            while (!maxDeque.isEmpty() &&
                   maxDeque.peekLast() < nums[right]) {
                maxDeque.pollLast();
            }

            while (!minDeque.isEmpty() &&
                   minDeque.peekLast() > nums[right]) {
                minDeque.pollLast();
            }

            maxDeque.offerLast(nums[right]);
            minDeque.offerLast(nums[right]);

            while (maxDeque.peekFirst() - minDeque.peekFirst() > limit) {

                if (nums[left] == maxDeque.peekFirst()) {
                    maxDeque.pollFirst();
                }

                if (nums[left] == minDeque.peekFirst()) {
                    minDeque.pollFirst();
                }

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}