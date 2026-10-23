class Solution {
    public static int closestToZero(int arr[]) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int ans = arr[left] + arr[right];

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(ans)) {
                ans = sum;
            }
            // If absolute values are same,
            // prefer larger sum.
            else if (Math.abs(sum) == Math.abs(ans)
                     && sum > ans) {
                ans = sum;
            }

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                return 0;
            }
        }

        return ans;
    }
}