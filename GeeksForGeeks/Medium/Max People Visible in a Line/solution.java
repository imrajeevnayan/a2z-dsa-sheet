class Solution {
    static int maxPeople(int[] arr) {
        int n = arr.length;

        // Step 1: Previous Greater Element (left boundary)
        int[] left = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Stack se sab chhote elements pop karo
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            // Stack top = previous greater element (-1 if none)
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Step 2: Next Greater Element (right boundary)
        stack.clear();
        int[] right = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            // Stack top = next greater element (n if none)
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Step 3: Har person ke liye visible count nikalo
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            // Boundaries ke beech ke log = right[i] - left[i] - 1
            int visible = right[i] - left[i] - 1;
            maxCount = Math.max(maxCount, visible);
        }

        return maxCount;
    }
}