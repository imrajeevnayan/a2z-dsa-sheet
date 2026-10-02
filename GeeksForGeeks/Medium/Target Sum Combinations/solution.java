class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sorting helps in pruning & avoiding duplicates easily
        backtrack(result, new ArrayList<>(), arr, target, 0);
        return result;
    }

    private void backtrack(ArrayList<ArrayList<Integer>> result, 
                           ArrayList<Integer> current, 
                           int[] arr, int remaining, int start) {

        // Base Case: Target achieved
        if (remaining == 0) {
            result.add(new ArrayList<>(current)); // Add copy of current combination
            return;
        }

        // Explore choices starting from 'start' index
        for (int i = start; i < arr.length; i++) {

            // Pruning: Since array is sorted, if current element > remaining, 
            // all next elements will also be greater. Stop here.
            if (arr[i] > remaining) break; 

            // Skip duplicates to avoid duplicate combinations in result
            if (i > start && arr[i] == arr[i - 1]) continue; 

            // Choose
            current.add(arr[i]);

            // Recurse: Pass 'i' (not i+1) because we can reuse same element
            backtrack(result, current, arr, remaining - arr[i], i);

            // Un-choose (Backtrack)
            current.remove(current.size() - 1);
        }
    }
}