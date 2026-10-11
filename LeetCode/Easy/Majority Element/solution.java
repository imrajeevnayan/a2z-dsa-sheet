class Solution {
    public int majorityElement(int[] nums) {
         Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
    
       for (int num : nums) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
        if (freq.get(num) > n / 2) return num; // Early termination
      }
        return -1;
        
    }
}