class Solution {
    public int findKthSmall(int[] arr, int k) {
        Arrays.sort(arr);

        for (int num : arr) {
            if (num <= k)   k++;
            else {
                break;
            }
        }

        return k;
    }
}