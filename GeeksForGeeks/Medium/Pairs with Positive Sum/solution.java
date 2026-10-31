class Solution {
    static long validPair(int[] arr) {

        Arrays.sort(arr);

        int left = 0,  right = arr.length - 1;

        long count = 0;

        while (left < right) {
            if (arr[left] + arr[right] > 0) {

                count += (right - left);
                right--;

            } else {
                left++;
            }
        }
        return count;
    }
}