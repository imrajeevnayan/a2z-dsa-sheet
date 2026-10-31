class Solution {
    public void swapElements(int[] arr) {
        int n = arr.length;

        for (int i = 0; i + 2 < n; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }
}