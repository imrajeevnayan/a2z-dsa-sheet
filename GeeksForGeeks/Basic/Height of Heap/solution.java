class Solution {
    static int heapHeight(int n, int arr[]) {
        if (n == 1) return 1;
        int height = 0;

        while (n > 1) {
            n /= 2;
            height++;
        }
        return height;
    }
}
