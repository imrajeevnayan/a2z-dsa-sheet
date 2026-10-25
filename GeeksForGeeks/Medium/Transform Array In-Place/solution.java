class Solution {
    public void arrange(int[] arr) {

        int n = arr.length;

        // First pass:
        // Old value + New value encode karo
        for (int i = 0; i < n; i++) {

            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }

        // Second pass:
        // New value extract karo
        for (int i = 0; i < n; i++) {

            arr[i] = arr[i] / n;
        }
    }
}