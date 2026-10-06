class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        
        // Monotonic decreasing stack (indices store karo)
        Deque<Integer> stack = new ArrayDeque<>();
        
        // Right se left traverse karo
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            
            // Stack se sab chhote logon ko pop karo — ye sab dikhte hain
            while (!stack.isEmpty() && heights[stack.peek()] < heights[i]) {
                stack.pop();
                count++;
            }
            
            // Agar stack mein koi bacha → wo next taller/equal person hai
            // Wo bhi dikhta hai (kyunki beech mein koi usse lamba nahi tha)
            if (!stack.isEmpty()) {
                count++;
            }
            result[i] = count;
            
            // Current person ko stack mein push karo
            stack.push(i);
        }
        
        return result;
    }
}