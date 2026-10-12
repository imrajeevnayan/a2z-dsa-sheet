class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = 0;
        int currSum = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < n) {
            // Expand window: Element add karo
            currSum += arr[end];

            // Shrink window: Jab tak sum > x hai, start ko aage badhao
            while (currSum > x) {
                // Update minimum length
                minLen = Math.min(minLen, end - start + 1);

                // Start element ko remove karo aur start badhao
                currSum -= arr[start];
                start++;
            }

            end++;
        }

        // Agar minLen update nahi hua, matlab koi subarray nahi mila
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}