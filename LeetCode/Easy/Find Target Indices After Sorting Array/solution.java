class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        List<Integer> result = new ArrayList<>();
        
        // Step 2: Find all indices where value equals target
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }
}