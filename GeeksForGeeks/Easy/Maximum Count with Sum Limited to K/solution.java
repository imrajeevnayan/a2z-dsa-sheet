
class Solution {
    public int toyCount(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 0;

        for (int cost : arr) {
            if (cost <= k) {
                k -= cost;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}