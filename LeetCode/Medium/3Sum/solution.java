class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            // Agar same number pehle hi process ho chuka hai toh skip karo
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Left side ke duplicates skip karo
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Right side ke duplicates skip karo
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++; 
                    right--;
                } else if (sum < 0) {
                    left++; // Sum badhana hai
                } else {
                    right--; // Sum kam karna hai
                }
            }
        }
        return res;
    }
}