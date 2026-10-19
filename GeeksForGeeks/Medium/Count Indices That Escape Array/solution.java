class Solution {
    public int goodIndices(int[] arr) {
        int n = arr.length;
        // 0: unvisited, 1: visiting (in current path), 2: good (escapes), 3: bad (cycle/stuck)
        int[] state = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (state[i] == 0) {
                dfs(arr, state, i);
            }
            if (state[i] == 2) {
                count++;
            }
        }

        return count;
    }

    private void dfs(int[] arr, int[] state, int idx) {
        // Base Case: Out of bounds -> Good
        if (idx < 0 || idx >= arr.length) {
            return; 
        }

        // If already processed
        if (state[idx] != 0) {
            return;
        }

        // Mark as visiting (to detect cycle)
        state[idx] = 1;

        int nextIdx = idx + arr[idx];

        // If next step is out of bounds, current is Good
        if (nextIdx < 0 || nextIdx >= arr.length) {
            state[idx] = 2; // Good
            return;
        }

        // If next step is 0, it's a dead end (Bad)
        if (arr[nextIdx] == 0) {
            state[idx] = 3; // Bad
            return;
        }

        // Recurse for next index
        dfs(arr, state, nextIdx);

        // After returning from recursion, check the state of nextIdx
        if (state[nextIdx] == 2) {
            state[idx] = 2; // If next escapes, current also escapes
        } else if (state[nextIdx] == 3 || state[nextIdx] == 1) {
            // If next is bad OR next is still 'visiting' (cycle detected)
            state[idx] = 3; // Bad
        }
    }
}