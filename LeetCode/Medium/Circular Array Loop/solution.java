class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        
        // Har index se cycle detect karne ki try karo
        for (int i = 0; i < n; i++) {
            // Agar already visited (marked 0) → skip
            if (nums[i] == 0) continue;
            
            // Is starting point ki direction yaad rakho
            // Saare cycle members same direction mein hone chahiye
            boolean isPositive = nums[i] > 0;
            
            // Floyd's slow-fast pointer
            int slow = i;
            int fast = i;
            
            while (true) {
                // Slow ek step aage
                slow = getNextIndex(nums, slow, n, isPositive);
                if (slow == -1) break; // Invalid: direction change ya self-loop
                
                // Fast do steps aage
                fast = getNextIndex(nums, fast, n, isPositive);
                if (fast == -1) break;
                fast = getNextIndex(nums, fast, n, isPositive);
                if (fast == -1) break;
                
                // Cycle mil gayi!
                if (slow == fast) return true;
            }
            
            // Ye path valid cycle nahi bana paya
            // Is path ke saare nodes ko 0 mark karo (visited)
            // Taaki future iterations mein dobara process na ho
            markVisited(nums, i, n, isPositive);
        }
        
        return false;
    }
    
    // Agla index calculate karo with validation
    // Return -1 agar invalid ho (direction change / self-loop)
    private int getNextIndex(int[] nums, int curr, int n, boolean isPositive) {
        // Direction check: agar sign alag hai → invalid path
        if ((nums[curr] > 0) != isPositive) return -1;
        
        // Next index with circular wrapping
        int next = ((curr + nums[curr]) % n + n) % n;
        
        // Self-loop check: cycle length must be > 1
        if (next == curr) return -1;
        
        return next;
    }
    
    // Path ke saare nodes ko 0 mark karo (visited)
    private void markVisited(int[] nums, int start, int n, boolean isPositive) {
        int curr = start;
        while (curr != -1 && nums[curr] != 0) {
            // Direction mismatch pe ruk jaao
            if ((nums[curr] > 0) != isPositive) break;
            
            int next = ((curr + nums[curr]) % n + n) % n;
            nums[curr] = 0; // Mark as visited
            
            // Self-loop pe bhi mark karo aur ruko
            if (next == curr) break;
            curr = next;
        }
    }
}