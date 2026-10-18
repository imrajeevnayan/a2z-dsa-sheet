class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; // Pointer for last unique element
        
        for (int j = 1; j < nums.length; j++) {
            // Agar naya element mila jo previous unique se alag hai
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        // i index tak unique elements hain, toh count = i + 1
        return i + 1;
    }
}