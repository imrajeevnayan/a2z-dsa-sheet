class Solution {
    public void sortInWave(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] < arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
    }
}