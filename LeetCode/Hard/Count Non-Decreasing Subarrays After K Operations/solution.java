import java.util.*;

class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;

        // reverse array
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }

        long ans = 0;
        long ops = k;

        Deque<Integer> dq = new ArrayDeque<>();
        int left = 0;

        for (int right = 0; right < n; right++) {

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[right]) {
                int r = dq.pollLast();
                int l = dq.isEmpty() ? left - 1 : dq.peekLast();

                ops -= (long) (r - l) * (nums[right] - nums[r]);
            }

            dq.offerLast(right);

            while (ops < 0) {
                ops += nums[dq.peekFirst()] - nums[left];

                if (dq.peekFirst() == left) {
                    dq.pollFirst();
                }

                left++;
            }

            ans += right - left + 1;
        }

        return ans;
    }
}